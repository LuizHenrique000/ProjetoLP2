package com.fundatec.lp2.service;

import org.springframework.stereotype.Service;
import com.fundatec.lp2.models.Conta;

@Service
public class ContaService {

	public void receberDados(Conta tarifa) {
		tarifa.getTempoTarifa();
		
		
	}

}
