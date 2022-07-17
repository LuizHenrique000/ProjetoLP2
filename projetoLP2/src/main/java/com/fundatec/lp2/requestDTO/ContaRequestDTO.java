package com.fundatec.lp2.requestDTO;

import java.time.LocalDateTime;
import com.fundatec.lp2.enums.StatusConta;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Conta;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ContaRequestDTO {

	private Integer id;
	private StatusConta statusConta;
	private TipoVeiculo tipoVeiculo;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	private Double valor;

	public ContaRequestDTO() {
		
	}
	
	public ContaRequestDTO(Conta conta) {
		id = conta.getId();
		statusConta = conta.getStatusConta();
		tipoVeiculo = conta.getTipoVeiculo();
		entrada = conta.getEntrada();
		saida = conta.getSaida();
		valor = conta.getValor();
	}

}
