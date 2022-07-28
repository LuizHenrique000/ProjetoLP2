package com.fundatec.lp2.converter;

import com.fundatec.lp2.models.Endereco;
import com.fundatec.lp2.requestdto.EnderecoRequestDTO;
import com.fundatec.lp2.responsedto.EnderecoResponseDTO;


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
	
	public static EnderecoResponseDTO converterParaResponse(Endereco endereco) {
		EnderecoResponseDTO dto = new EnderecoResponseDTO();
		dto.setLogradouro(endereco.getLogradouro());
		dto.setCep(endereco.getCep());
		return dto;
	}
}
