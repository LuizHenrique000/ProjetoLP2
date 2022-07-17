package com.fundatec.lp2.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundatec.lp2.converterRequest.ContaConverter;
import com.fundatec.lp2.enums.StatusConta;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.repository.ContaRepository;
import com.fundatec.lp2.requestDTO.ContaRequestDTO;

@Service
public class ContaService {

	@Autowired
	private ContaRepository repository;

	public ContaRequestDTO abrirConta(ContaRequestDTO dto) {
		dto.setStatusConta(StatusConta.ATIVA);
		tempoEmMinutos(dto.getEntrada(),dto.getSaida());
		calcularConta(dto.getTipoVeiculo(),);
		Conta entidade = ContaConverter.converterParaEntity(dto);
		Conta entidadePersistida = repository.save(entidade);
		return ContaConverter.converterParaDTO(entidadePersistida);

	}

	public Long tempoEmMinutos(LocalDateTime entrada, LocalDateTime saida) {
		Long tempoFinal = ChronoUnit.MINUTES.between(entrada, saida);
		return tempoFinal;
	}
	
	public void calcularConta(TipoVeiculo tipoVeiculo,Long tempo, Double valor) {
		
	}

}
