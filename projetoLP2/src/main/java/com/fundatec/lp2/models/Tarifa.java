package com.fundatec.lp2.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TAREFA")
public class Tarifa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false, name="VEICULO")
	private String veiculo;
	
	@Column(nullable=false, name="ENTRADA")
	private LocalDateTime entrada;
	
	@Column(nullable=false, name="SAIDA")
	private LocalDateTime saida;
	
	@Column(nullable=false, name="VALOR")
	private Double valor;

}
