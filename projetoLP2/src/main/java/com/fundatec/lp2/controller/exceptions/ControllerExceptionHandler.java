package com.fundatec.lp2.controller.exceptions;

import java.time.Instant;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.fundatec.lp2.service.exceptions.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(EntityNotFoundException e, HttpServletRequest request) {
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(HttpStatus.NOT_FOUND.value());
		err.setError("Resource not found");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ConstraintViolationErrorDTO> methodArgumentNotValidHandler(
			ConstraintViolationException exception, HttpServletRequest request) {
		log.error(exception.getMessage());
		ConstraintViolationErrorDTO constraintViolationsDTO = new ConstraintViolationErrorDTO();
		constraintViolationsDTO.setStatus(HttpStatus.BAD_REQUEST.value());
		constraintViolationsDTO.setMessage("Requisicao possui campos invalidos");
		for (ConstraintViolation<?> violation : exception.getConstraintViolations()) {
			constraintViolationsDTO.addError(violation.getPropertyPath().toString(), violation.getMessage());
		}
		

		return new ResponseEntity<>(constraintViolationsDTO, HttpStatus.BAD_REQUEST);
	}
}