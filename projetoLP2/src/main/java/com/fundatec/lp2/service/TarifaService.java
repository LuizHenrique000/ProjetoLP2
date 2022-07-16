package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converter.TarifaConverter;
import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.repository.TarifaRepository;
import com.fundatec.lp2.requestDTO.TarifaDTO;

@Service
public class TarifaService {

	@Autowired
	private TarifaRepository repository;

	public TarifaDTO salvarTarifa(TarifaDTO dto) {
		Tarifa entidade = TarifaConverter.converterParaEntity(dto);
		Tarifa entidadePersistida = repository.save(entidade);
		return TarifaConverter.converterParaDTO(entidadePersistida);
	}

}
