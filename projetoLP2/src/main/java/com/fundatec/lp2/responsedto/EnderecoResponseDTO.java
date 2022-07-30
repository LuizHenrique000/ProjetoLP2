package com.fundatec.lp2.responsedto;

import com.fundatec.lp2.models.Endereco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
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
