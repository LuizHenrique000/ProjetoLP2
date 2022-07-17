package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundatec.lp2.converterRequest.ContaConverter;
import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.repository.ContaRepository;
import com.fundatec.lp2.requestDTO.ContaRequestDTO;

@Service
public class ContaService {

	@Autowired
	private ContaRepository repository;

	public ContaRequestDTO abrirConta(ContaRequestDTO dto) {
		Conta entidade = ContaConverter.converterParaEntity(dto);
		Conta entidadePersistida = repository.save(entidade);
		return ContaConverter.converterParaDTO(entidadePersistida);

	}

}

//dto.setStatusConta(StatusConta.ATIVA);