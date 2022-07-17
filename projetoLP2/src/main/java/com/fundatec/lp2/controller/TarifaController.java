package com.fundatec.lp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundatec.lp2.requestDTO.TarifaRequestDTO;
import com.fundatec.lp2.service.TarifaService;

@RestController
@RequestMapping(value = "/tarifa")
public class TarifaController {

	@Autowired
	private TarifaService service;

	@PostMapping
	public ResponseEntity<TarifaRequestDTO> salvarTarifa(@RequestBody TarifaRequestDTO dto) {
		TarifaRequestDTO tarifaDTO = service.salvarTarifa(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(tarifaDTO);

	}
	
	
}
