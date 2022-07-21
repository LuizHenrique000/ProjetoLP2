package com.fundatec.lp2.models;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fundatec.lp2.enums.StatusConta;
import com.fundatec.lp2.enums.TipoVeiculo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "CONTA")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Assinante assinante;

	@Column(nullable = true, name = "STATUS_CONTA")
	@Enumerated(EnumType.STRING)
	private StatusConta statusConta;

	@Column(nullable = false, name = "VEICULO")
	private TipoVeiculo TipoVeiculo;

	@Column(nullable = false, name = "ENTRADA")
	private LocalDateTime entrada;

	@Column(name = "SAIDA")
	private LocalDateTime saida;

	@Column(nullable = false, name = "VALOR")
	private Double valor;


}
