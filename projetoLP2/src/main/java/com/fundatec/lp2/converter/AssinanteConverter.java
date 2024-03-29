package com.fundatec.lp2.converter;

import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.requestdto.AssinanteRequestDTO;
import com.fundatec.lp2.responsedto.AssinanteResponseDTO;

public class AssinanteConverter {

	public static AssinanteRequestDTO converterParaDTO(Assinante entity) {
		AssinanteRequestDTO dto = new AssinanteRequestDTO();
		dto.setId(entity.getId());
		dto.setNome(entity.getNome());
		dto.setCpf(entity.getCpf());
		dto.setEndereco(entity.getEndereco());
		dto.setVeiculo(entity.getVeiculo());
		dto.setCredito(entity.getCredito());
		dto.setPlano(entity.getPlano());
		return dto;
	}

	public static Assinante converterParaEntity(AssinanteRequestDTO dto) {
		Assinante entity = new Assinante();
		entity.setId(dto.getId());
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setEndereco(dto.getEndereco());
		entity.setVeiculo(dto.getVeiculo());
		entity.setCredito(dto.getCredito());
		entity.setPlano(dto.getPlano());
		return entity;
	}
	
	public static AssinanteResponseDTO converterParaResponse(Assinante entity) {
		AssinanteResponseDTO dto = new AssinanteResponseDTO();
		dto.setNome(entity.getNome());
		dto.setCpf(entity.getCpf());
		dto.setEndereco(entity.getEndereco());
		dto.setVeiculo(entity.getVeiculo());
		dto.setCredito(entity.getCredito());
		dto.setPlano(entity.getPlano());
		return dto;
	}

}
