package com.fundatec.lp2.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fundatec.lp2.enums.PlanoAssinante;
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

	@NotNull(message = "{plano.not.null}")
	@Column(name = "PLANO_ASSINANTE")
	@Enumerated(EnumType.STRING)
	private PlanoAssinante plano;

	@NotNull(message = "{statusConta.not.null}")
	@Column(name = "STATUS_CONTA")
	@Enumerated(EnumType.STRING)
	private StatusConta statusConta;

	@Column(name = "VEICULO")
	private TipoVeiculo tipoVeiculo;

	@NotNull(message = "{entrada.not.null}")
	@Column(name = "ENTRADA")
	private LocalDateTime entrada;

	@NotNull(message = "{saida.not.null}")
	@Column(name = "SAIDA")
	private LocalDateTime saida;

	@Column(name = "VALOR")
	private BigDecimal valor;

}
