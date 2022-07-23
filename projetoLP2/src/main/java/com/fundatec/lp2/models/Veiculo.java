package com.fundatec.lp2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fundatec.lp2.enums.TipoVeiculo;
import lombok.Data;

@Data
@Entity
@Table(name = "VEICULO")
public class Veiculo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, name = "TIPO_VEICULO")
	@Enumerated(EnumType.STRING)
	private TipoVeiculo tipo;

	@Column(nullable = false, name = "PLACA")
	private String placa;

}
