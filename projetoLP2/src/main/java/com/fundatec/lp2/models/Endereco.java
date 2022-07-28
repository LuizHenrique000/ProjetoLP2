package com.fundatec.lp2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "{logradouro.not.blank}")
	@Column(name = "LOGRADOURO")
	private String logradouro;

	@NotBlank(message = "{numero.not.blank}")
	@Column(name = "NUMERO")
	private String numero;

	@NotBlank(message = "{cep.not.blank}")
	@Size(min = 8, max = 8, message = "{cep.size}")
	@Column(name = "CEP")
	private String cep;
	
}
