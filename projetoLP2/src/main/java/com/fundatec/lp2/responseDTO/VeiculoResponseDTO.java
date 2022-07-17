package com.fundatec.lp2.responseDTO;

import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.models.Veiculo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class VeiculoResponseDTO {
	
	private TipoVeiculo tipo;
	private String placa;
	private Assinante assinante;
	
	public VeiculoResponseDTO(){
		
	}
	
	public VeiculoResponseDTO(Veiculo veiculo) {
		tipo = veiculo.getTipo();
		placa = veiculo.getPlaca();
		assinante = veiculo.getAssinante();
	}

}
