package com.fundatec.lp2.controller.exceptions;

import java.io.Serializable;
import java.time.Instant;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;

	public StandardError() {

	}
}