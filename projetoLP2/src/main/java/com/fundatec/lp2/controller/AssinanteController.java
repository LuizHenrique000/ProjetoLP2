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

import com.fundatec.lp2.requestDTO.AssinanteRequestDTO;
import com.fundatec.lp2.responseDTO.AssinanteResponseDTO;
import com.fundatec.lp2.service.AssinanteService;

@RestController
@RequestMapping(value = "/assinantes")
public class AssinanteController {

	@Autowired
	private AssinanteService service;

	@PostMapping
	public ResponseEntity<AssinanteResponseDTO> salvarAssinante(@RequestBody AssinanteRequestDTO dto) {
		AssinanteResponseDTO assinanteDTO = service.salvarAssinante(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(assinanteDTO);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<AssinanteResponseDTO> findById(@PathVariable Integer id) {
		AssinanteResponseDTO assinanteDTO = service.findById(id);
		return ResponseEntity.ok(assinanteDTO);

	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") Integer id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();

	}

}
