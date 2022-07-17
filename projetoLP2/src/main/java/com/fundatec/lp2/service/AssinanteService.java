package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converterRequest.AssinanteRequest;
import com.fundatec.lp2.converterResponse.AssinanteResponse;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.repository.AssinanteRepository;
import com.fundatec.lp2.requestDTO.AssinanteRequestDTO;
import com.fundatec.lp2.responseDTO.AssinanteResponseDTO;
import com.fundatec.lp2.service.exceptions.EntityNotFoundException;

@Service
public class AssinanteService {

	@Autowired
	private AssinanteRepository repository;

	public AssinanteResponseDTO findById(Integer id) {
		Assinante entity = repository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Id " + id + " inexistente"));
		AssinanteResponseDTO dto = new AssinanteResponseDTO(entity);
		return dto;
	}

	public AssinanteResponseDTO salvarAssinante(AssinanteRequestDTO dto) {
		Assinante entidade = AssinanteRequest.converterParaEntity(dto);
		Assinante entidadePersistida = repository.save(entidade);
		return AssinanteResponse.converterParaResponse(entidadePersistida);
	}

	public void deleteById(Integer id) {
		repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id " + id + " inexistente"));
		repository.deleteById(id);

	}

}
