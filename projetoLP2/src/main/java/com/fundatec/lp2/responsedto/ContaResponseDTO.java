package com.fundatec.lp2.responsedto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fundatec.lp2.enums.PlanoAssinante;
import com.fundatec.lp2.enums.StatusConta;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Conta;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ContaResponseDTO {

	private PlanoAssinante plano;
	private StatusConta statusConta;
	private TipoVeiculo tipoVeiculo;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	private BigDecimal valor;

	public ContaResponseDTO() {

	}

	ContaResponseDTO(Conta conta) {
		plano = conta.getPlano();
		statusConta = conta.getStatusConta();
		tipoVeiculo = conta.getTipoVeiculo();
		entrada = conta.getEntrada();
		saida = conta.getSaida();
		valor = conta.getValor();
	}
}
