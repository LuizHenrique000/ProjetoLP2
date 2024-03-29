package com.fundatec.lp2.responsedto;

import java.math.BigDecimal;

import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Tarifa;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TarifaResponseDTO {
	
	private TempoTarifa tempoTarifa;
	private TipoVeiculo tipoVeiculo;
	private BigDecimal valor;
	
	public TarifaResponseDTO(){
		
	}
	
	public TarifaResponseDTO(Tarifa tarifa){
		tempoTarifa = tarifa.getTempoTarifa();
		tipoVeiculo = tarifa.getTipoVeiculo();
		valor = tarifa.getValor();
	}

}
