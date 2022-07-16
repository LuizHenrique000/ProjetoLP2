package com.fundatec.lp2.converter;

import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.requestDTO.TarifaDTO;

public class TarifaConverter {

	public static TarifaDTO converterParaDTO(Tarifa entity) {
		TarifaDTO dto = new TarifaDTO();
		dto.setId(entity.getId());
		dto.setTempoTarifa(entity.getTempoTarifa());
		dto.setTipoVeiculo(entity.getTipoVeiculo());
		dto.setValor(entity.getValor());
		return dto;
	}
	
	public static Tarifa converterParaEntity(TarifaDTO dto) {
		Tarifa entity = new Tarifa();
		entity.setId(dto.getId());
		entity.setTempoTarifa(dto.getTempoTarifa());
		entity.setTipoVeiculo(dto.getTipoVeiculo());
		entity.setValor(dto.getValor());
		return entity;
	}
}
