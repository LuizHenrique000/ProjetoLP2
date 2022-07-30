package com.fundatec.lp2.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import com.fundatec.lp2.requestdto.EnderecoRequestDTO;
import com.fundatec.lp2.responsedto.EnderecoResponseDTO;
import com.fundatec.lp2.service.EnderecoService;

import io.restassured.http.ContentType;

@WebMvcTest(EnderecoController.class)
public class EnderecoControllerTest {

	@Autowired
	private EnderecoController enderecoController;
	
	@MockBean
	private EnderecoService enderecoService;
	
	@BeforeEach
	public void setup() {
		standaloneSetup(this.enderecoController);
	}
	
	@Test
	public void deveRetornarSucesso_QuandoReceberEndereco() {
		
		when(this.enderecoService.salvarEndereco(new EnderecoRequestDTO(1,"Rua teste","123456789","28")))
		.thenReturn(new EnderecoResponseDTO("Rua teste","123456789"));
		
		given()
		.accept(ContentType.JSON)
	.when()
		.get("/endereco/{dto}", new EnderecoRequestDTO(1,"Rua teste","123456789","28"))
	.then()
		.statusCode(HttpStatus.CREATED.value());
		
	}
	
}
