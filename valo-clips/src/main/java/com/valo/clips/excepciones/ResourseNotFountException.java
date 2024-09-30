package com.valo.clips.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourseNotFountException extends RuntimeException {

	private static final long serialVersionId = 1L;
	
	public ResourseNotFountException(String mensaje) {
		super(mensaje);
	}
	
}
