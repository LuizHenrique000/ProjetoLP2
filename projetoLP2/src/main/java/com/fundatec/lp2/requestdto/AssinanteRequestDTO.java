package com.fundatec.lp2.requestdto;

import java.math.BigDecimal;

import com.fundatec.lp2.enums.PlanoAssinante;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.models.Endereco;
import com.fundatec.lp2.models.Veiculo;

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
	private Veiculo veiculo;
	private BigDecimal credito;
	private PlanoAssinante plano;

	public AssinanteRequestDTO() {

	}

	public AssinanteRequestDTO(Assinante assinante) {
		id = assinante.getId();
		nome = assinante.getNome();
		cpf = assinante.getCpf();
		endereco = assinante.getEndereco();
		veiculo = assinante.getVeiculo();
		credito = assinante.getCredito();
		plano = assinante.getPlano();

	}

}
