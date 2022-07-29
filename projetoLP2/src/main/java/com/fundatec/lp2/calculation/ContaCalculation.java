package com.fundatec.lp2.calculation;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import com.fundatec.lp2.enums.PlanoAssinante;
import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.service.exceptions.CreditoNegativoException;

public class ContaCalculation {

	public static TempoTarifa calcularTempo(Conta entidade) {
		LocalDateTime entrada = entidade.getEntrada();
		LocalDateTime saida = entidade.getSaida();
		Long diferencaEmMinutos = ChronoUnit.MINUTES.between(entrada, saida);
		return TempoTarifa.obterTempo(diferencaEmMinutos);
	}

	public static Conta validarDesconto(Conta conta) {
		if (conta.getPlano().equals(PlanoAssinante.ASSINANTE)) {
			BigDecimal valor = conta.getValor();
			BigDecimal porcentagem = new BigDecimal(0.15);
			BigDecimal valorAtualizado = valor.multiply(porcentagem);
			conta.setValor(valorAtualizado);
			return conta;
		}
		return conta;
	}

	public static Assinante validarCredito(Assinante assinante) {
		BigDecimal credito = assinante.getCredito();
		BigDecimal zero = new BigDecimal(0);
		if (credito.compareTo(zero) == -1) {
			throw new CreditoNegativoException("Credito negativo");
		}
		return assinante;
	}

	public static BigDecimal validarPossivelPagamento(BigDecimal diferenca) {
		BigDecimal zero = new BigDecimal(0);
		if (diferenca.compareTo(zero) == -1) {
			throw new CreditoNegativoException("Credito insuficiente");
		}
		return diferenca;
	}

}
