package com.fundatec.lp2.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "{tempotarifa.not.null}")
	@Enumerated(EnumType.STRING)
	@Column(name = "TEMPO_TARIFA")
	private TempoTarifa tempoTarifa;
	
	@NotNull(message = "{tipoveiculo.not.null}")
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_VEICULO")
	private TipoVeiculo tipoVeiculo;
	
	@NotNull(message = "{valor.not.null}")
	@Positive(message = "{valor.positive}")
	@Column(name = "VALOR")
	private BigDecimal valor;
	
}
