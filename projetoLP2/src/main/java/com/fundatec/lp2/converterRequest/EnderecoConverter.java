package com.fundatec.lp2.converterRequest;

import com.fundatec.lp2.models.Endereco;
import com.fundatec.lp2.requestDTO.EnderecoRequestDTO;


public class EnderecoConverter {

	public static EnderecoRequestDTO converterParaDTO(Endereco entity) {
		EnderecoRequestDTO dto = new EnderecoRequestDTO();
		dto.setId(entity.getId());
		dto.setLogradouro(entity.getLogradouro());
		dto.setNumero(entity.getNumero());
		dto.setCep(entity.getCep());
		return dto;
	}
	
	public static Endereco converterParaEntity(EnderecoRequestDTO dto) {
		Endereco entity = new Endereco();
		entity.setId(dto.getId());
		entity.setLogradouro(dto.getLogradouro());
		entity.setNumero(dto.getNumero());
		entity.setCep(dto.getCep());
		return entity;
	}
}
