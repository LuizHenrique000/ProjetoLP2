package com.fundatec.lp2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Integer id;

	@Column(nullable = false, name = "LOGRADOURO")
	private String logradouro;

	@Column(nullable = false, name = "NUMERO")
	private String numero;

	@Column(nullable = false, name = "CEP")
	private String cep;
	
}
