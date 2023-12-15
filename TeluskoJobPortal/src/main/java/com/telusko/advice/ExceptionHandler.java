package com.telusko.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.telusko.exception.JobPostIdNotFoundException;
import com.telusko.exception.QueryNotFoundException;

@RestControllerAdvice
public class ExceptionHandler {

//*************************************************************************************
	
	
	
	
	
	
	// controller method for handling id not found exception
	@org.springframework.web.bind.annotation.ExceptionHandler(JobPostIdNotFoundException.class)
	public ResponseEntity<Map<String, String>> idNotFoundExceptionHandler(JobPostIdNotFoundException exception) {
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("errorMessage", exception.getMessage());
		return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.NOT_FOUND);

	}
	
	
	
	//*************************************************************************************
	
	

	
	
	
	// controller method to handle invalid method argument exception
	

	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<	Map<String, String>> invalidArgumentHandler(MethodArgumentNotValidException exception) {
		Map<String, String> errorMap = new HashMap<>();
		
		//getting the exception detail and putting in the map object 
		exception
		.getBindingResult()
		.getFieldErrors()
		.forEach(error -> {
			errorMap
			.put(error.getField(), error.getDefaultMessage());
		});
		
	
		return new ResponseEntity<Map<String,String>>(errorMap,HttpStatus.BAD_REQUEST);

	}
	
	
	
	
	//*************************************************************************************
	
	
	
	
	
	

	// controller method to handle general exception
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, String>> handleGeneralException(Exception exception) {
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("errorMessage", exception.getMessage());
		return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);

	}
	
	
	
	//*************************************************************************************
	
	
	
	
	// controller method to handle query string not found exception
		@org.springframework.web.bind.annotation.ExceptionHandler(QueryNotFoundException.class)
		public ResponseEntity<Map<String, String>> handleQueryStringNotFoundException(QueryNotFoundException exception) {
			Map<String, String> errorMap = new HashMap<>();
			errorMap.put("errorMessage", exception.getMessage());
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.NOT_FOUND);

		}
	
	
}
