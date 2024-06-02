package com.exampleMapStruct.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //from controller after checking @Valid if it fails the control passes here and it check for all fields with errormsg and throws the custom exception
public class handleExceptionHandler {
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		Map<String,String> errorMap =  new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) ->{
		
			String field = ((FieldError) error).getField();
			String msg = error.getDefaultMessage();
			errorMap.put(field, msg);
		});
		return new ResponseEntity<Object>(errorMap,HttpStatus.BAD_REQUEST);
		
		
	}

}
