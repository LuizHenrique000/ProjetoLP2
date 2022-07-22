package com.fundatec.lp2.requestDTO;

import java.math.BigDecimal;

import com.fundatec.lp2.enums.PlanoAssinante;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.models.Endereco;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AssinanteRequestDTO {
	
	private Integer id;
	private String nome;
	private String cpf;
	private Endereco endereco;
	private BigDecimal credito;
	private PlanoAssinante plano;

	public AssinanteRequestDTO() {

	}

	public AssinanteRequestDTO(Assinante assinante) {
		id = assinante.getId();
		nome = assinante.getNome();
		cpf = assinante.getCpf();
		endereco = assinante.getEndereco();
		credito = assinante.getCredito();
		plano = assinante.getPlano();

	}

}
