package com.fundatec.lp2.converterResponse;

import com.fundatec.lp2.models.Veiculo;
import com.fundatec.lp2.responseDTO.VeiculoResponseDTO;

public class VeiculoResponse {

	public static VeiculoResponseDTO converterParaResponse(Veiculo veiculo) {
		VeiculoResponseDTO dto = new VeiculoResponseDTO();
		dto.setPlaca(veiculo.getPlaca());
		dto.setTipo(veiculo.getTipo());
		return dto;
		
	}
}
