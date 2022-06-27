package com.fundatec.lp2.dto;

import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Veiculo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class VeiculoDTO {

	private Integer id;
	private TipoVeiculo tipo;

	public VeiculoDTO() {

	}

	public VeiculoDTO(Integer id, TipoVeiculo tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	public VeiculoDTO(Veiculo veiculo) {
		id = veiculo.getId();
		tipo = veiculo.getTipo();
	}
}
