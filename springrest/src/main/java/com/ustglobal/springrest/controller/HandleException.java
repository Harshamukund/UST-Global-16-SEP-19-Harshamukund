package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;
@RestControllerAdvice
public class HandleException {
	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		EmployeeResponse response=new EmployeeResponse();
		response.setStatuscode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an Exception");
		return response;
	}
	
	

}
