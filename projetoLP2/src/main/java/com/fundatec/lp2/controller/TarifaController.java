package com.fundatec.lp2.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.requestdto.TarifaRequestDTO;
import com.fundatec.lp2.responsedto.TarifaResponseDTO;
import com.fundatec.lp2.service.TarifaService;

@RestController
@RequestMapping(value = "/tarifa")
public class TarifaController {
	
	private TarifaService tarifaService;
	
	public TarifaController(TarifaService tarifaService) {
		this.tarifaService = tarifaService;	
	}

	@PostMapping
	public ResponseEntity<TarifaResponseDTO> salvarTarifa(@RequestBody @Valid TarifaRequestDTO dto) {
		TarifaResponseDTO tarifaDTO = tarifaService.salvarTarifa(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(tarifaDTO);

	}
	
	@GetMapping
	public ResponseEntity<List<Tarifa>> findAll(){
		List<Tarifa> tarifas = tarifaService.findAll();
		return ResponseEntity.ok(tarifas);
		
	}

	@PutMapping(value = "/{id}/{valor}")
	public ResponseEntity<TarifaResponseDTO> atualizarValorTarifaPorId(@PathVariable("id") Integer id,
			@PathVariable("valor") BigDecimal valor) {
		TarifaResponseDTO response = tarifaService.atualizarValor(id, valor);
		return ResponseEntity.ok(response);

	}

}
