package com.fundatec.lp2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tarifa")
public class TarifaController {
	
	@PutMapping("/veiculo/{novoValor}")
	public void mudarValorTarifaVeiculo(@PathVariable(value = novoValor) ) {
		
	}
}
