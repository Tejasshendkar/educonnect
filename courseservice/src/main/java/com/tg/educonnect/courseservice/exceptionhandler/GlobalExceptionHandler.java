package com.tg.educonnect.courseservice.exceptionhandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tg.educonnect.courseservice.exception.CustomException;

import feign.FeignException;


@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<?> handleCustomException(CustomException ex){
		Map<String,Object> errorBody= new HashMap<>();
		errorBody.put("timestamp", LocalDateTime.now());
        errorBody.put("errorMessage", ex.getMessage());
        errorBody.put("errorCode", ex.getErrorCode());
        errorBody.put("status", HttpStatus.NOT_FOUND.value());
		
		 return new ResponseEntity<>(errorBody,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(FeignException.NotFound.class)
    public ResponseEntity<String> handleUserNotFound(FeignException.NotFound ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("User not found ");
    }
}
