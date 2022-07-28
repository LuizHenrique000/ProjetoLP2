package com.fundatec.lp2.converter;

import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.requestdto.ContaRequestDTO;
import com.fundatec.lp2.responsedto.ContaResponseDTO;

public class ContaConverter {

	public static ContaRequestDTO converterParaDTO(Conta entity) {
		ContaRequestDTO dto = new ContaRequestDTO();
		dto.setId(entity.getId());
		dto.setStatusConta(entity.getStatusConta());
		dto.setTipoVeiculo(entity.getTipoVeiculo());
		dto.setEntrada(entity.getEntrada());
		dto.setSaida(entity.getSaida());
		dto.setValor(entity.getValor());
		dto.setPlano(entity.getPlano());
		return dto;
	}

	public static Conta converterParaEntity(ContaRequestDTO dto) {
		Conta entity = new Conta();
		entity.setId(dto.getId());
		entity.setStatusConta(dto.getStatusConta());
		entity.setTipoVeiculo(dto.getTipoVeiculo());
		entity.setEntrada(dto.getEntrada());
		entity.setSaida(dto.getSaida());
		entity.setValor(dto.getValor());
		entity.setPlano(dto.getPlano());
		return entity;
	}
	
	public static ContaResponseDTO converterparaResponse(Conta conta) {
		ContaResponseDTO dto = new ContaResponseDTO();
		dto.setStatusConta(conta.getStatusConta());
		dto.setTipoVeiculo(conta.getTipoVeiculo());
		dto.setEntrada(conta.getEntrada());
		dto.setSaida(conta.getSaida());
		dto.setValor(conta.getValor());
		dto.setPlano(conta.getPlano());
		return dto;
	}
}
