package com.fundatec.lp2.dto;

import com.fundatec.lp2.models.Assinante;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AssinanteDTO {

	private Integer id;
	private String nome;

	public AssinanteDTO() {

	}

	public AssinanteDTO(Integer id,String nome) {
		this.id = id;
		this.nome = nome;
	}

	public AssinanteDTO(Assinante assinante) {
		id = assinante.getId();
		nome = assinante.getNome();

	}

}
