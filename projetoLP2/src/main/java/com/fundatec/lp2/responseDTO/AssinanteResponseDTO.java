package com.fundatec.lp2.responseDTO;

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
	private Double credito;

	public AssinanteResponseDTO() {
		
	}
	
	public AssinanteResponseDTO(Assinante assinante) {
		nome = assinante.getNome();
		cpf = assinante.getCpf();
		credito = assinante.getCredito();
	}
	
}
