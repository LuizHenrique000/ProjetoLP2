package com.fundatec.lp2.converterResponse;

import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.responsedto.ContaResponseDTO;

public class ContaResponse {

	public static ContaResponseDTO converterparaResponse(Conta conta) {
		ContaResponseDTO dto = new ContaResponseDTO();
		dto.setStatusConta(conta.getStatusConta());
		dto.setValor(conta.getValor());
		return dto;
	}
}
