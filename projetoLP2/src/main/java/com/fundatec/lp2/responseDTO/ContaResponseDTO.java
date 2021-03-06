package com.fundatec.lp2.responseDTO;

import java.math.BigDecimal;

import com.fundatec.lp2.enums.StatusConta;
import com.fundatec.lp2.models.Conta;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ContaResponseDTO {

	private StatusConta statusConta;
	private BigDecimal valor;

	public ContaResponseDTO() {

	}

	ContaResponseDTO(Conta conta) {
		statusConta = conta.getStatusConta();
		valor = conta.getValor();
	}
}
