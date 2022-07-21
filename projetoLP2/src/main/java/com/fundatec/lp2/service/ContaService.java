package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.calculations.ContaCalculations;
import com.fundatec.lp2.converterRequest.ContaConverter;
import com.fundatec.lp2.enums.PlanoAssinante;
import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.repository.ContaRepository;
import com.fundatec.lp2.requestDTO.ContaRequestDTO;

@Service
public class ContaService {

	@Autowired
	private ContaRepository repository;

	@Autowired
	private TarifaService tarifaService;

	public ContaRequestDTO fecharConta(ContaRequestDTO dto) {
		Conta conta = new Conta();
		TipoVeiculo tipoVeiculo = dto.getTipoVeiculo();
		conta.setTipoVeiculo(tipoVeiculo);
		conta.setValor(dto.getValor());
		conta.setEntrada(dto.getEntrada());
		conta.setSaida(dto.getSaida());
		conta.setStatusConta(dto.getStatusConta());
		TempoTarifa tempoTarifa = ContaCalculations.calcularTempo(conta);
		Tarifa tarifaFinal = tarifaService.findByTempoTarifaAndTipoVeiculo(tempoTarifa, tipoVeiculo);
		conta.setValor(tarifaFinal.getValor());
		conta.setAssinante(dto.getAssinante());
		validarDesconto(conta);
		Conta contaPersistida = repository.save(conta);
		return ContaConverter.converterParaDTO(contaPersistida);
	}

	public Conta validarDesconto(Conta conta) {
		if (conta.getAssinante().getPlano().equals(PlanoAssinante.ASSINANTE)) {
			Double valor = conta.getValor();
			Double valorAtualizado = (valor / 100 * 15);
			conta.setValor(valorAtualizado);
			return conta;
		}
		return conta;
	}
}