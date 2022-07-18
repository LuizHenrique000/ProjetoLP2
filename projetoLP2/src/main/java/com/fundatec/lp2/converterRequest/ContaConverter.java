package com.fundatec.lp2.converterRequest;

import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.requestDTO.ContaRequestDTO;

public class ContaConverter {

	public static ContaRequestDTO converterParaDTO(Conta entity) {
		ContaRequestDTO dto = new ContaRequestDTO();
		dto.setId(entity.getId());
		dto.setStatusConta(entity.getStatusConta());
		dto.setTipoVeiculo(entity.getTipoVeiculo());
		dto.setEntrada(entity.getEntrada());
		dto.setSaida(entity.getSaida());
		dto.setValor(entity.getValor());
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
		return entity;

	}
}
