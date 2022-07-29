package com.fundatec.lp2.service.exceptions;

public class CreditoNegativoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CreditoNegativoException(String msg) {
		super(msg);
	}

}
