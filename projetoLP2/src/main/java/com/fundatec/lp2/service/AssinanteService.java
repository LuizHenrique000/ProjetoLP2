package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converter.AssinanteConverter;
import com.fundatec.lp2.dto.AssinanteDTO;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.repository.AssinanteRepository;

@Service
public class AssinanteService {

	@Autowired
	private AssinanteRepository repository;

	public AssinanteDTO findById(Integer id) {
		Assinante entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Assinante inexistente"));
		AssinanteDTO dto = new AssinanteDTO(entity);
		return dto;
	}

	public AssinanteDTO salvarAssinante(AssinanteDTO dto) {
		Assinante entidade = AssinanteConverter.converterParaEntity(dto);
		Assinante entidadePersistida = repository.save(entidade);
		return AssinanteConverter.converterParaDTO(entidadePersistida);

	}

	public void deleteById(Integer id) {
		repository.findById(id).orElseThrow(() -> new RuntimeException("Assinante inexistente"));
		repository.deleteById(id);

	}

}
