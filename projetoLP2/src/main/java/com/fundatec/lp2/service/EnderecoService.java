package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converter.EnderecoConverter;
import com.fundatec.lp2.models.Endereco;
import com.fundatec.lp2.repository.EnderecoRepository;
import com.fundatec.lp2.requestdto.EnderecoRequestDTO;
import com.fundatec.lp2.responsedto.EnderecoResponseDTO;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;

	public EnderecoResponseDTO salvarEndereco(EnderecoRequestDTO dto) {
		Endereco entidade = EnderecoConverter.converterParaEntity(dto);
		Endereco entidadePersistida = repository.save(entidade);
		return EnderecoConverter.converterParaResponse(entidadePersistida);
	}
}
