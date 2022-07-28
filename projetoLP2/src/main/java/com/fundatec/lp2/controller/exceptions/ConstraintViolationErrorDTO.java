package com.fundatec.lp2.controller.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ConstraintViolationErrorDTO {

	private LocalDateTime timestamp;
	private Integer status;
	private String message;
	private Map<String, String> errors = new HashMap<>();

    public ConstraintViolationErrorDTO() {
        this.timestamp = LocalDateTime.now();
    }

    public void addError(String field, String message) {
        errors.put(field, message);
    }

    public Map<String, String> getErrors() {
        return this.errors;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
