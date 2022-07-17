package com.fundatec.lp2.converterRequest;

import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.requestDTO.AssinanteRequestDTO;

public class AssinanteRequest {

	public static AssinanteRequestDTO converterParaDTO(Assinante entity) {
		AssinanteRequestDTO dto = new AssinanteRequestDTO();
		dto.setNome(entity.getNome());
		dto.setCpf(entity.getCpf());
		dto.setEndereco(entity.getEndereco());
		dto.setCredito(entity.getCredito());
		return dto;

	}

	public static Assinante converterParaEntity(AssinanteRequestDTO dto) {
		Assinante entity = new Assinante();
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setEndereco(dto.getEndereco());
		entity.setCredito(dto.getCredito());
		return entity;

	}

}
