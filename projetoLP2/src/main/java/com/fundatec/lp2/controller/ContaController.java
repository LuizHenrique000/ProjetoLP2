package com.fundatec.lp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundatec.lp2.models.Conta;
import com.fundatec.lp2.requestDTO.ContaRequestDTO;
import com.fundatec.lp2.service.ContaService;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {

	@Autowired
	private ContaService service;

	@PostMapping
	public ResponseEntity<Conta> abrirConta(@RequestBody ContaRequestDTO dto) {
		Conta contaDTO = service.fecharConta(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(contaDTO);
	}
	
}

//Pagar Conta