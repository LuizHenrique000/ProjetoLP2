package com.fundatec.lp2.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.calculation.ContaCalculation;
import com.fundatec.lp2.converter.ContaConverter;
import com.fundatec.lp2.enums.StatusConta;
import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.repository.AssinanteRepository;
import com.fundatec.lp2.repository.ContaRepository;
import com.fundatec.lp2.requestdto.ContaRequestDTO;
import com.fundatec.lp2.responsedto.ContaResponseDTO;
import com.fundatec.lp2.service.exceptions.EntityNotFoundException;

@Service
public class ContaService {

	@Autowired
	private ContaRepository repository;

	@Autowired
	private AssinanteRepository assinanteRepository;

	@Autowired
	private TarifaService tarifaService;

	public ContaResponseDTO fecharConta(ContaRequestDTO dto) {
		Conta conta = new Conta();
		TipoVeiculo tipoVeiculo = dto.getTipoVeiculo();
		conta.setTipoVeiculo(tipoVeiculo);
		conta.setValor(dto.getValor());
		conta.setEntrada(dto.getEntrada());
		conta.setSaida(dto.getSaida());
		conta.setStatusConta(dto.getStatusConta());
		conta.setPlano(dto.getPlano());
		TempoTarifa tempoTarifa = ContaCalculation.calcularTempo(conta);
		Tarifa tarifaFinal = tarifaService.findByTempoTarifaAndTipoVeiculo(tempoTarifa, tipoVeiculo);
		conta.setValor(tarifaFinal.getValor());
		ContaCalculation.validarDesconto(conta);
		Conta contaPersistida = repository.save(conta);
		return ContaConverter.converterparaResponse(contaPersistida);
	}

	public ContaResponseDTO pagarContaPorId(Integer idConta, Integer idAssinante) {
		Assinante assinante = assinanteRepository.findById(idAssinante).get();
		ContaCalculation.validarCredito(assinante);
		Conta conta = repository.findById(idConta)
				.orElseThrow(() -> new EntityNotFoundException("Id " + idConta + " inexistente"));
		BigDecimal valor = conta.getValor();
		BigDecimal credito = assinante.getCredito();
		BigDecimal diferenca = credito.subtract(valor);
		ContaCalculation.validarPossivelPagamento(diferenca);
		conta.setStatusConta(StatusConta.ENCERRADA);
		assinante.setCredito(diferenca);
		assinanteRepository.save(assinante);
		return ContaConverter.converterparaResponse(conta);
	}

	

}