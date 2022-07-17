package com.fundatec.lp2.responseDTO;

import com.fundatec.lp2.models.Endereco;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EnderecoResponseDTO {
	
	private String logradouro;
	private String cep;
	
	public EnderecoResponseDTO() {
		
	}
	
	public EnderecoResponseDTO(Endereco endereco) {
		logradouro = endereco.getLogradouro();
		cep = endereco.getCep();
	}

}
