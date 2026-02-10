package com.webServises.microEmpresa.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.webServises.microEmpresa.services.exceptions.DatabaseException;
import com.webServises.microEmpresa.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
		
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resorceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus stattus= HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), stattus.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(stattus).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> dataBase(DatabaseException e, HttpServletRequest request){
		String error = "DataBase error";
		HttpStatus stattus= HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), stattus.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(stattus).body(err);
	}
	
}
