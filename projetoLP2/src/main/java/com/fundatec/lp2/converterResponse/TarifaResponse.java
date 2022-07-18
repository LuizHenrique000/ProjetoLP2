package com.fundatec.lp2.converterResponse;

import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.responseDTO.TarifaResponseDTO;

public class TarifaResponse {

	public static TarifaResponseDTO converterParaResponse(Tarifa tarifa) {
		TarifaResponseDTO dto = new TarifaResponseDTO();
		dto.setTempoTarifa(tarifa.getTempoTarifa());
		dto.setTipoVeiculo(tarifa.getTipoVeiculo());
		dto.setValor(tarifa.getValor());
		return dto;
	}
	
}
