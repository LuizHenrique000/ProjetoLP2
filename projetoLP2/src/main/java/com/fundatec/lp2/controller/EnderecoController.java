//package com.fundatec.lp2.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fundatec.lp2.requestDTO.EnderecoRequestDTO;
//import com.fundatec.lp2.responseDTO.EnderecoResponseDTO;
//import com.fundatec.lp2.service.EnderecoService;
//
//@RestController
//@RequestMapping(value = "/endereco")
//public class EnderecoController {
//
//	@Autowired
//	private EnderecoService service;
//	
//	@PostMapping
//	public ResponseEntity<EnderecoResponseDTO> salvarEndereco(@RequestBody EnderecoRequestDTO dto){
//		service.salvarEndereco(dto);
//		
//		
//		return null;
//	}
//}
