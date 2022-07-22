package com.fundatec.lp2.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.calculation.ContaCalculation;
import com.fundatec.lp2.converterResponse.ContaResponse;
import com.fundatec.lp2.enums.PlanoAssinante;
import com.fundatec.lp2.enums.StatusConta;
import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.repository.AssinanteRepository;
import com.fundatec.lp2.repository.ContaRepository;
import com.fundatec.lp2.requestDTO.ContaRequestDTO;
import com.fundatec.lp2.responseDTO.ContaResponseDTO;
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
		validarDesconto(conta);
		Conta contaPersistida = repository.save(conta);
		return ContaResponse.converterparaResponse(contaPersistida);
	}

	public Conta validarDesconto(Conta conta) {
		if (conta.getPlano().equals(PlanoAssinante.ASSINANTE)) {
			BigDecimal valor = conta.getValor();
			BigDecimal porcentagem = new BigDecimal(0.15);
			BigDecimal valorAtualizado = valor.multiply(porcentagem);
			conta.setValor(valorAtualizado);
			return conta;
		}
		return conta;
	}

	public ContaResponseDTO pagarContaPorId(Integer idConta, Integer idAssinante) {
		Assinante assinante = assinanteRepository.findById(idAssinante).get();
		Conta conta = repository.findById(idConta).orElseThrow(() -> new EntityNotFoundException("Id " + idConta + " inexistente"));
		BigDecimal valor = conta.getValor();
		BigDecimal credito = assinante.getCredito();
		BigDecimal diferenca = credito.subtract(valor);
		conta.setStatusConta(StatusConta.ENCERRADA);
		assinante.setCredito(diferenca);
		assinanteRepository.save(assinante);
		return ContaResponse.converterparaResponse(conta);
	}

}