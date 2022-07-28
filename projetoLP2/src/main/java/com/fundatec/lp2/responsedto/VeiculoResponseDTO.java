package com.fundatec.lp2.responsedto;

import com.fundatec.lp2.enums.TipoVeiculo;
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

	public VeiculoResponseDTO() {

	}

	public VeiculoResponseDTO(Veiculo veiculo) {
		tipo = veiculo.getTipo();
		placa = veiculo.getPlaca();

	}

}
