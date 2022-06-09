package com.fundatec.lp2.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Entity
@Data
public class Tarifa {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false, name="VEICULO")
	private String Veiculo;
	
	@Column(nullable=false, name="ENTRADA")
	private LocalDateTime entrada;
	
	@Column(nullable=false, name="SAIDA")
	private LocalDateTime saida;
	
	@Column(nullable=false, name="VALOR")
	private Double valor;

}
