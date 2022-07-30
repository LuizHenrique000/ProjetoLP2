package com.fundatec.lp2.requestdto;

import com.fundatec.lp2.models.Endereco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
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
