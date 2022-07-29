package com.fundatec.lp2.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.responsedto.VeiculoResponseDTO;
import com.fundatec.lp2.service.VeiculoService;
import io.restassured.http.ContentType;

@WebMvcTest(VeiculoController.class)
public class VeiculoControllerTest {

	@Autowired
	private VeiculoController veiculoController;
	
	@MockBean
	private VeiculoService veiculoService;
	
	@BeforeEach
	public void setup() {
		standaloneSetup(this.veiculoController);
	}
	
	@Test
	public void deveRetornarSucesso_QuandoBuscarVeiculo() {

		when(this.veiculoService.findById(1))
			.thenReturn(new VeiculoResponseDTO(TipoVeiculo.CARRO, "ABC1234"));
		
		given()
			.accept(ContentType.JSON)
		.when()
			.get("/veiculo/{id}", 1)
		.then()
			.statusCode(HttpStatus.OK.value());
	}
}
