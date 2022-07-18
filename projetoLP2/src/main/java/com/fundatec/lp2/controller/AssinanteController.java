package com.fundatec.lp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundatec.lp2.models.Assinante;
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

	@GetMapping
	public ResponseEntity<List<Assinante>> findAll() {
		List<Assinante> assinanteDTO = service.findAll();
		return ResponseEntity.ok(assinanteDTO);

	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") Integer id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();

	}

	@PutMapping(value = "/{id}/{credito}")
	public ResponseEntity<AssinanteResponseDTO> recarregarCreditoPorId(@PathVariable("id") Integer id,
			@PathVariable("credito") Double credito) {
		AssinanteResponseDTO response = service.recarregarCredito(id, credito);
		return ResponseEntity.ok(response);

	}

}
