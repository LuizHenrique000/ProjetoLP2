package com.fundatec.lp2.requestDTO;

import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Veiculo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class VeiculoRequestDTO {

	private Integer id;
	private TipoVeiculo tipo;
	private String placa;

	public VeiculoRequestDTO() {

	}

	public VeiculoRequestDTO(Veiculo veiculo) {
		id = veiculo.getId();
		tipo = veiculo.getTipo();
		placa = veiculo.getPlaca();
	}
}
