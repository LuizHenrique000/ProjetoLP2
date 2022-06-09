package com.fundatec.lp2;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Tarifa {

	@Column()
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
