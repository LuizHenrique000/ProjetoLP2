package com.fundatec.lp2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ASSINANTE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Assinante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, name = "NOME")
	private String nome;

	@Column(nullable = false, name = "CPF")
	private String cpf;

	@ManyToOne
	@JoinColumn(name="ID_ENDERECO")
	private Endereco enderco;
	
	@Column(nullable= false, name = "CREDITO")
	private Double credito;
}

