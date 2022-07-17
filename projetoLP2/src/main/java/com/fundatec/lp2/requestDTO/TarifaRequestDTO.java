package com.fundatec.lp2.requestDTO;

import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Tarifa;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TarifaRequestDTO {

	private Integer id;
	private TempoTarifa tempoTarifa;
	private TipoVeiculo tipoVeiculo;
	private Double valor;
	
	public TarifaRequestDTO() {
		
	}
	
	public TarifaRequestDTO(Tarifa tarifa) {
		id = tarifa.getId();
		tempoTarifa = tarifa.getTempoTarifa();
		tipoVeiculo = tarifa.getTipoVeiculo();
		valor = tarifa.getValor();
	}

}


