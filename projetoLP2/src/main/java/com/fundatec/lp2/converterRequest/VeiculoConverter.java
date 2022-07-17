package com.fundatec.lp2.converterRequest;

import com.fundatec.lp2.models.Veiculo;
import com.fundatec.lp2.requestDTO.VeiculoRequestDTO;

public class VeiculoConverter {

	public static VeiculoRequestDTO converterParaDTO(Veiculo entity) {
		VeiculoRequestDTO dto = new VeiculoRequestDTO();
		dto.setId(entity.getId());
		dto.setTipo(entity.getTipo());
		dto.setPlaca(entity.getPlaca());
		dto.setAssinante(entity.getAssinante());
		return dto;
	}

	public static Veiculo converterParaEntity(VeiculoRequestDTO dto) {
		Veiculo entity = new Veiculo();
		entity.setId(dto.getId());
		entity.setTipo(dto.getTipo());
		entity.setPlaca(dto.getPlaca());
		entity.setAssinante(dto.getAssinante());
		return entity;

	}

}
