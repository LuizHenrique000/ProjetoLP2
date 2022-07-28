package com.fundatec.lp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundatec.lp2.requestdto.ContaRequestDTO;
import com.fundatec.lp2.responsedto.ContaResponseDTO;
import com.fundatec.lp2.service.ContaService;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {

	@Autowired
	private ContaService service;

	@PostMapping
	public ResponseEntity<ContaResponseDTO> abrirConta(@RequestBody ContaRequestDTO dto) {
		ContaResponseDTO contaDTO = service.fecharConta(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(contaDTO);
	}

	@PutMapping(value = "/{idConta}/{idCliente}")
	public ResponseEntity<ContaResponseDTO> pagarContaPorId(@PathVariable Integer idConta, @PathVariable Integer idCliente) {
		ContaResponseDTO contaDTO = service.pagarContaPorId(idConta, idCliente);
		return ResponseEntity.ok(contaDTO);
	}
}
