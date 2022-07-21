package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundatec.lp2.calculations.ContaCalculations;
import com.fundatec.lp2.converterRequest.ContaConverter;
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

	public Conta fecharConta(ContaRequestDTO dto) {
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
		Conta contaAtualizada = ContaConverter.converterParaEntity(dto);
		Conta contaPersistida = repository.save(contaAtualizada);
		return contaPersistida;
	}
}