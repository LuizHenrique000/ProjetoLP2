package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.dto.AssinanteDTO;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.repository.AssinanteRepository;

@Service
public class AssinanteService {

	@Autowired
	private AssinanteRepository repository;

	public AssinanteDTO findById(Integer id) {
		Assinante entity = repository.findById(id).get();
		AssinanteDTO dto = new AssinanteDTO(entity);
		return dto;
	}

}
