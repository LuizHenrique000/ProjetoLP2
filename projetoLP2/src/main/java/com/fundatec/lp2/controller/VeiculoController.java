package com.fundatec.lp2.controller;

import java.util.List;

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

import com.fundatec.lp2.models.Veiculo;
import com.fundatec.lp2.requestdto.VeiculoRequestDTO;
import com.fundatec.lp2.responsedto.VeiculoResponseDTO;
import com.fundatec.lp2.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoService service;

	@PostMapping
	public ResponseEntity<VeiculoResponseDTO> salvarVeiculo(@RequestBody VeiculoRequestDTO dto) {
		VeiculoResponseDTO veiculoDTO = service.salvarVeiculo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(veiculoDTO);
	}
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> findALL() {
		List<Veiculo> veiculoDTO = service.findAll();
		return ResponseEntity.ok(veiculoDTO);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id")Integer id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();
		
	}
}
