package com.fundatec.lp2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fundatec.lp2.enums.TipoVeiculo;
import lombok.Data;

@Data
@Entity(name="VEICULO")
public class Veiculo {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, name = "TIPO_VEICULO")
	private TipoVeiculo tipo;

	@Column(nullable = false, name = "PLACA")
	private String placa;

	@Column(nullable = true, name = "ASSINANTE")
	private Assinante assinante;
}
