package com.fundatec.lp2.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "ASSINANTE")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class Assinante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, name = "NOME")
	private String nome;

	@Column(nullable = false, name = "CPF")
	private String cpf;

	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Veiculo veiculo;

	@Column(nullable = false, name = "CREDITO")
	private Double credito;

	public Assinante() {

	}

	public Assinante(Integer id, String nome, String cpf, Endereco endereco, Double credito) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.credito = credito;
	}

}

// Criar DTO endereco


