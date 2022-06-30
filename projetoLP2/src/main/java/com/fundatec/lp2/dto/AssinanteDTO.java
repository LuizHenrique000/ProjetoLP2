package com.fundatec.lp2.dto;

import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.models.Endereco;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AssinanteDTO {

	private String nome;
	private String cpf;
	private Endereco endereco;
	private Double credito;

	public AssinanteDTO() {

	}

	public AssinanteDTO(Assinante assinante) {
		nome = assinante.getNome();
		cpf = assinante.getCpf();
		endereco = assinante.getEndereco();
		credito = assinante.getCredito();

	}

}
