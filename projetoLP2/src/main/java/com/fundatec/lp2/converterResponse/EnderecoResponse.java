package com.fundatec.lp2.converterResponse;

import com.fundatec.lp2.models.Endereco;
import com.fundatec.lp2.responseDTO.EnderecoResponseDTO;

public class EnderecoResponse {

	public static EnderecoResponseDTO converterParaResponse(Endereco endereco) {
		EnderecoResponseDTO dto = new EnderecoResponseDTO();
		dto.setLogradouro(endereco.getLogradouro());
		dto.setCep(endereco.getCep());
		return dto;
	}

}
