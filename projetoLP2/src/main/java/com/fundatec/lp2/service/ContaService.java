package com.fundatec.lp2.service;

import org.springframework.stereotype.Service;
import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.models.Veiculo;

@Service
public class ContaService {

	public void receberDados(Conta tarifa, Veiculo veiculo) {
		tarifa.getTempoTarifa();
		veiculo.getTipo();
		
		
	}

}
