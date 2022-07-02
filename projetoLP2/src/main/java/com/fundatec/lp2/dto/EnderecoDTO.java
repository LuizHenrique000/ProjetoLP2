package com.fundatec.lp2.dto;

import com.fundatec.lp2.models.Endereco;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EnderecoDTO {

	private Integer id;
	private String logradouro;
	private String numero;
	private String cep;

	public EnderecoDTO() {

	}

	public EnderecoDTO(Endereco endereco) {
		id = endereco.getId();
		logradouro = endereco.getLogradouro();
		numero = endereco.getNumero();
		cep = endereco.getCep();
	}

}
