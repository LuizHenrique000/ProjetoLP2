package com.fundatec.lp2.service.exceptions;

public class TarifaInexistenteException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public TarifaInexistenteException(String msg) {
		super(msg);
	}
}
