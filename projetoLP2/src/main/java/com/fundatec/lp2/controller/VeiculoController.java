package com.fundatec.lp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fundatec.lp2.dto.VeiculoDTO;
import com.fundatec.lp2.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService service;
	
	@GetMapping(value = "/{id}")
	public VeiculoDTO findById(@PathVariable Integer id) {
		return service.findById(id);
	}
}
