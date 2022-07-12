package com.fundatec.lp2.converter;

import com.fundatec.lp2.dto.ContaDTO;
import com.fundatec.lp2.models.Conta;

public class ContaConverter {

	public static ContaDTO converterParaDTO(Conta entity) {
		ContaDTO dto = new ContaDTO();
		dto.setId(entity.getId());
		dto.setStatusConta(entity.getStatusConta());
		dto.setVeiculo(entity.getVeiculo());
		dto.setEntrada(entity.getEntrada());
		dto.setSaida(entity.getSaida());
		dto.setValor(entity.getValor());
		return dto;

	}

	public static Conta converterParaEntity(ContaDTO dto) {
		Conta entity = new Conta();
		entity.setId(dto.getId());
		entity.setStatusConta(dto.getStatusConta());
		entity.setVeiculo(dto.getVeiculo());
		entity.setEntrada(dto.getEntrada());
		entity.setSaida(dto.getSaida());
		entity.setValor(dto.getValor());
		return entity;

	}
}
