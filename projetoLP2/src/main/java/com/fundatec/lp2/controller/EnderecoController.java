package com.fundatec.lp2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundatec.lp2.requestdto.EnderecoRequestDTO;
import com.fundatec.lp2.responsedto.EnderecoResponseDTO;
import com.fundatec.lp2.service.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService service;
	
	@PostMapping
	public ResponseEntity<EnderecoResponseDTO> salvarEndereco(@RequestBody @Valid EnderecoRequestDTO dto){
		EnderecoResponseDTO enderecoDTO = service.salvarEndereco(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoDTO);
	}
}
