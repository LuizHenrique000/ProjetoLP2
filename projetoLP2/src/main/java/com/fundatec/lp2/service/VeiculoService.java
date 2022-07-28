package com.fundatec.lp2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converter.VeiculoConverter;
import com.fundatec.lp2.models.Veiculo;
import com.fundatec.lp2.repository.VeiculoRepository;
import com.fundatec.lp2.requestdto.VeiculoRequestDTO;
import com.fundatec.lp2.responsedto.VeiculoResponseDTO;
import com.fundatec.lp2.service.exceptions.EntityNotFoundException;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;

	public List<Veiculo> findAll() {
		return repository.findAll();

	}

	public VeiculoResponseDTO salvarVeiculo(VeiculoRequestDTO dto) {
		Veiculo entidade = VeiculoConverter.converterParaEntity(dto);
		Veiculo entidadePersistida = repository.save(entidade);
		return VeiculoConverter.converterParaResponse(entidadePersistida);
	}

	public void deleteById(Integer id) {
		repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id " + id + " inexistente"));
		repository.deleteById(id);
	}

}
