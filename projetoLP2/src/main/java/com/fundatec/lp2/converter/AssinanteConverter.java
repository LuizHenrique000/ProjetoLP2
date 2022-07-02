package com.fundatec.lp2.converter;

import com.fundatec.lp2.dto.AssinanteDTO;
import com.fundatec.lp2.models.Assinante;

public class AssinanteConverter {

	public static AssinanteDTO converterParaDTO(Assinante entity) {
		AssinanteDTO dto = new AssinanteDTO();
		dto.setNome(entity.getNome());
		dto.setCpf(entity.getCpf());
		dto.setEndereco(entity.getEndereco());
		dto.setCredito(entity.getCredito());
		return dto;

	}

	public static Assinante converterParaEntity(AssinanteDTO dto) {
		Assinante entity = new Assinante();
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setEndereco(dto.getEndereco());
		entity.setCredito(dto.getCredito());
		return entity;

	}

}
