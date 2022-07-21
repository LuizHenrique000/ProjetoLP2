package com.fundatec.lp2.calculations;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.models.Conta;

public class ContaCalculations {

	public static TempoTarifa calcularTempo(Conta entidade) {
		LocalDateTime entrada = entidade.getEntrada();
		LocalDateTime saida = entidade.getSaida();
		Long diferencaEmMinutos = ChronoUnit.MINUTES.between(entrada, saida);
		return TempoTarifa.obterTempo(diferencaEmMinutos);
	}
	
	
}
