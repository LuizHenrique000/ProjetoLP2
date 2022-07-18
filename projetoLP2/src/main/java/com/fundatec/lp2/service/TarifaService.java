package com.fundatec.lp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converterRequest.TarifaConverter;
import com.fundatec.lp2.converterResponse.TarifaResponse;
import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.repository.TarifaRepository;
import com.fundatec.lp2.requestDTO.TarifaRequestDTO;
import com.fundatec.lp2.responseDTO.TarifaResponseDTO;
import com.fundatec.lp2.service.exceptions.EntityNotFoundException;

@Service
public class TarifaService {

	@Autowired
	private TarifaRepository repository;

	public TarifaRequestDTO salvarTarifa(TarifaRequestDTO dto) {
		Tarifa entidade = TarifaConverter.converterParaEntity(dto);
		Tarifa entidadePersistida = repository.save(entidade);
		return TarifaConverter.converterParaDTO(entidadePersistida);
	}
	
	public List<Tarifa> findAll(){
		return repository.findAll();
	}

	public TarifaResponseDTO atualizarValor(Integer id, Double valor) {
		Tarifa entidade = repository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Id " + id + " inexistente"));
		entidade.setValor(valor);
		Tarifa entidadePersistida = repository.save(entidade);
		return TarifaResponse.converterParaResponse(entidadePersistida);
	}

}
