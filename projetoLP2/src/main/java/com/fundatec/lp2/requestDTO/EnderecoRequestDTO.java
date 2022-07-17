package com.fundatec.lp2.requestDTO;

import com.fundatec.lp2.models.Endereco;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EnderecoRequestDTO {

	private Integer id;
	private String logradouro;
	private String numero;
	private String cep;

	public EnderecoRequestDTO() {

	}

	public EnderecoRequestDTO(Endereco endereco) {
		id = endereco.getId();
		logradouro = endereco.getLogradouro();
		numero = endereco.getNumero();
		cep = endereco.getCep();
	}

}
