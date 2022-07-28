package com.fundatec.lp2.converterResponse;

import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.responsedto.AssinanteResponseDTO;

public class AssinanteResponse {

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
