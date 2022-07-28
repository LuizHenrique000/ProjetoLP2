package com.fundatec.lp2.models;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import com.fundatec.lp2.enums.PlanoAssinante;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "ASSINANTE")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class Assinante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "{name.not.blank}")
	@Column(nullable = false, name = "NOME")
	private String nome;

	@Size(min = 11, max = 11, message = "{cpf.size}")
	@Column(nullable = false, name = "CPF")
	private String cpf;

	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL)
	private Veiculo veiculo;

	@PositiveOrZero(message = "{credito.positive.or.zero}")
	@Column(nullable = false, name = "CREDITO")
	private BigDecimal credito;

	@Column(nullable = true, name = "PLANO_ASSINANTE")
	@Enumerated(EnumType.STRING)
	private PlanoAssinante plano;

	public Assinante() {

	}

	public Assinante(Integer id, String nome, String cpf, Endereco endereco, BigDecimal credito, PlanoAssinante plano) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.credito = credito;
		this.plano = plano;
	}

}

// Criar DTO endereco
