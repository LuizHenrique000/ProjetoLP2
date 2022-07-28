package com.fundatec.lp2.converterRequest;

import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.requestdto.TarifaRequestDTO;

public class TarifaConverter {

	public static TarifaRequestDTO converterParaDTO(Tarifa entity) {
		TarifaRequestDTO dto = new TarifaRequestDTO();
		dto.setId(entity.getId());
		dto.setTempoTarifa(entity.getTempoTarifa());
		dto.setTipoVeiculo(entity.getTipoVeiculo());
		dto.setValor(entity.getValor());
		return dto;
	}
	
	public static Tarifa converterParaEntity(TarifaRequestDTO dto) {
		Tarifa entity = new Tarifa();
		entity.setTempoTarifa(dto.getTempoTarifa());
		entity.setTipoVeiculo(dto.getTipoVeiculo());
		entity.setValor(dto.getValor());
		return entity;
	}
}
