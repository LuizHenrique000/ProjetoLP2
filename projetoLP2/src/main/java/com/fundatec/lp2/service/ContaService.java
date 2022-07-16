package com.fundatec.lp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converter.ContaConverter;
import com.fundatec.lp2.enums.StatusConta;
import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.repository.ContaRepository;
import com.fundatec.lp2.requestDTO.ContaDTO;

@Service
public class ContaService {

	@Autowired
	private ContaRepository repository;

	public ContaDTO abrirConta(ContaDTO dto) {
		dto.setStatusConta(StatusConta.ATIVA);
		Conta entidade = ContaConverter.converterParaEntity(dto);
		Conta entidadePersistida = repository.save(entidade);
		return ContaConverter.converterParaDTO(entidadePersistida);

	}

}
