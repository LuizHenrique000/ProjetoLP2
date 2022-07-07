package com.fundatec.lp2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.enums.TipoVeiculo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name = "TARIFA")
public class Tarifa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = true, name = "TEMPO_TARIFA")
	private TempoTarifa tempoTarifa;
	
	@Column(nullable = true, name = "TIPO_VEICULO")
	private TipoVeiculo tipoVeiculo;
	
	@Column(nullable = true, name = "VALOR")
	private Double valor;
	
}
