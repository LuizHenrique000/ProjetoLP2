package com.fundatec.lp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.repository.AssinanteRepository;

@RestController
@RequestMapping("/assinantes")
public class AssinanteController {
	
	@Autowired
	private AssinanteRepository assinanteRepository;
	
	@GetMapping
	public List<Assinante> listar() {
		return assinanteRepository.findAll();
	}
	
	@PostMapping
	public Assinante adicionar(@RequestBody Assinante assinante) {
		return assinanteRepository.save(assinante);
	}

}
