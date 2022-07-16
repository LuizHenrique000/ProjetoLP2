package com.fundatec.lp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundatec.lp2.requestDTO.VeiculoDTO;
import com.fundatec.lp2.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService service;

	@PostMapping
	public ResponseEntity<VeiculoDTO> salvarVeiculo(@RequestBody VeiculoDTO dto) {
		VeiculoDTO veiculoDTO = service.salvarVeiculo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(veiculoDTO);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> findById(@PathVariable Integer id) {
		VeiculoDTO veiculoDTO = service.findById(id);
		return ResponseEntity.ok(veiculoDTO);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id")Integer id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();
		
	}
}
