package com.tg.educonnect.appointmentservice.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import feign.FeignException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(AppointmentNotFoundException.class)
	public ResponseEntity<?> appointmentNotFound(AppointmentNotFoundException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}

//	@ExceptionHandler(FeignException.class)
//	public ResponseEntity<?> feignClientException(FeignException ex) {
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
//	}
	
	@ExceptionHandler(FeignException.class)
	public ResponseEntity<?> feignClientNotFoundException(FeignException.NotFound ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<?> customEcxeptionHandler(CustomException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}

}
