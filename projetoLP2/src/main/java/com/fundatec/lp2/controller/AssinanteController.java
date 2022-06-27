package com.fundatec.lp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fundatec.lp2.dto.AssinanteDTO;
import com.fundatec.lp2.service.AssinanteService;

@RestController
@RequestMapping(value = "/assinantes")
public class AssinanteController {
	
	@Autowired
	private AssinanteService service;
	
	@GetMapping(value = "/{id}")
	public AssinanteDTO findById(@PathVariable Integer id) {
		return service.findById(id);
	}

}
