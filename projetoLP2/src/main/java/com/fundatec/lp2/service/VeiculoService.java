package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converter.VeiculoConverter;
import com.fundatec.lp2.dto.VeiculoDTO;
import com.fundatec.lp2.models.Veiculo;
import com.fundatec.lp2.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;

	public VeiculoDTO findById(Integer id) {
		Veiculo entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Veiculo inexistente"));
		VeiculoDTO dto = new VeiculoDTO(entity);
		return dto;
	}

	public VeiculoDTO salvarVeiculo(VeiculoDTO dto) {
		Veiculo entidade = VeiculoConverter.converterParaEntity(dto);
		Veiculo entidadePersistida = repository.save(entidade);
		return VeiculoConverter.converterParaDTO(entidadePersistida);
	}

	public void deleteById(Integer id) {
		repository.findById(id).orElseThrow(() -> new RuntimeException("Veiculo inexistente"));
		repository.deleteById(id);
	}

}
