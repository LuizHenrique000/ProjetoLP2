package com.fundatec.lp2.converter;

import com.fundatec.lp2.dto.VeiculoDTO;
import com.fundatec.lp2.models.Veiculo;

public class VeiculoConverter {

	public static VeiculoDTO converterParaDTO(Veiculo entity) {
		VeiculoDTO dto = new VeiculoDTO();
		dto.setId(entity.getId());
		dto.setTipo(entity.getTipo());
		dto.setPlaca(entity.getPlaca());
		dto.setAssinante(entity.getAssinante());
		return dto;
	}

	public static Veiculo converterParaEntity(VeiculoDTO dto) {
		Veiculo entity = new Veiculo();
		entity.setId(dto.getId());
		entity.setTipo(dto.getTipo());
		entity.setPlaca(dto.getPlaca());
		entity.setAssinante(dto.getAssinante());
		return entity;

	}

}
