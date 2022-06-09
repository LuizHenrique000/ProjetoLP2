package com.fundatec.lp2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity(name = "ASSINANTE")
public class Assinante {


	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, name = "NOME")
	private String nome;

	@Column(nullable = false, name = "CPF")
	private String cpf;

	@Column(nullable = false, name = "ENDERECO")
	private Endereco enderco;
	
	@Column(nullable= false, name = "CREDITO")
	private Double credito;
}

