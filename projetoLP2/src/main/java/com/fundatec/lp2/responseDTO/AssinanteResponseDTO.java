package com.fundatec.lp2.responseDTO;

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
public class AssinanteResponseDTO {
	
	private String nome;
	private String cpf;
	private Endereco endereco;
	private Veiculo veiculo;
	private BigDecimal credito;
	private PlanoAssinante plano;

	public AssinanteResponseDTO() {
		
	}
	
	public AssinanteResponseDTO(Assinante assinante) {
		nome = assinante.getNome();
		cpf = assinante.getCpf();
		endereco = assinante.getEndereco();
		veiculo = assinante.getVeiculo();
		credito = assinante.getCredito();
		plano = assinante.getPlano();
	}
	
}
