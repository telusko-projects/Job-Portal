package com.telusko.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.telusko.exception.JobPostIdNotFoundException;

@RestControllerAdvice
public class ExceptionHandler {

	// controller method for handling id not found exception
	@org.springframework.web.bind.annotation.ExceptionHandler(JobPostIdNotFoundException.class)
	public Map<String, String> idNotFoundExceptionHandler(JobPostIdNotFoundException exception) {
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("errorMessage", exception.getMessage());
		return errorMap;

	}

	// controller method to handle invalid method argument exception
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> invalidArgumentHandler(MethodArgumentNotValidException exception) {
		Map<String, String> errorMap = new HashMap<>();
		exception
		.getBindingResult()
		.getFieldErrors()
		.forEach(error -> {
			errorMap
			.put(error.getField(), error.getDefaultMessage());
		});
		
		return errorMap;

	}

	// controller method to handle general exception
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public Map<String, String> handleGeneralException(Exception exception) {
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("errorMessage", exception.getMessage());
		return errorMap;

	}
}
