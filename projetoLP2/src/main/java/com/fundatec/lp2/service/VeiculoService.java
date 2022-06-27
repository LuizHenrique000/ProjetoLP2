package com.fundatec.lp2.service;

import org.springframework.stereotype.Service;

import com.fundatec.lp2.dto.VeiculoDTO;
import com.fundatec.lp2.models.Veiculo;
import com.fundatec.lp2.repository.VeiculoRepository;

@Service
public class VeiculoService {

	private VeiculoRepository repository;
	
	public VeiculoDTO findById(Integer id) {
		Veiculo entity = repository.findById(id).get();
		VeiculoDTO dto = new VeiculoDTO(entity);
		return dto;
	}
}
