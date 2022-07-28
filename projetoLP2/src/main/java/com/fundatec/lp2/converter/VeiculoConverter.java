package com.fundatec.lp2.converter;

import com.fundatec.lp2.models.Veiculo;
import com.fundatec.lp2.requestdto.VeiculoRequestDTO;
import com.fundatec.lp2.responsedto.VeiculoResponseDTO;

public class VeiculoConverter {

	public static VeiculoRequestDTO converterParaDTO(Veiculo entity) {
		VeiculoRequestDTO dto = new VeiculoRequestDTO();
		dto.setId(entity.getId());
		dto.setTipo(entity.getTipo());
		dto.setPlaca(entity.getPlaca());
		return dto;
	}
	
	public static Veiculo converterParaEntity(VeiculoRequestDTO dto) {
		Veiculo entity = new Veiculo();
		entity.setId(dto.getId());
		entity.setTipo(dto.getTipo());
		entity.setPlaca(dto.getPlaca());
		return entity;
	}
	
	public static VeiculoResponseDTO converterParaResponse(Veiculo veiculo) {
		VeiculoResponseDTO dto = new VeiculoResponseDTO();
		dto.setTipo(veiculo.getTipo());
		dto.setPlaca(veiculo.getPlaca());
		return dto;
	}

}
