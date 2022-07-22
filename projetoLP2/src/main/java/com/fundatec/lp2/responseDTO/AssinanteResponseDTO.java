package com.fundatec.lp2.responseDTO;

import java.math.BigDecimal;

import com.fundatec.lp2.enums.PlanoAssinante;
import com.fundatec.lp2.models.Assinante;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AssinanteResponseDTO {
	
	private String nome;
	private String cpf;
	private BigDecimal credito;
	private PlanoAssinante plano;

	public AssinanteResponseDTO() {
		
	}
	
	public AssinanteResponseDTO(Assinante assinante) {
		nome = assinante.getNome();
		cpf = assinante.getCpf();
		credito = assinante.getCredito();
		plano = assinante.getPlano();
	}
	
}
