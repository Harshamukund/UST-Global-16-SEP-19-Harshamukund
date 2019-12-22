package com.ustglobal.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springrest.dto.EmployeeBean;
import com.ustglobal.springrest.dto.EmployeeResponse;
import com.ustglobal.springrest.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	
	@PostMapping(path="/add",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.addEmploee(bean)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data added to the db");
		}else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the db");
			
		}
	return response;
}//end of add employee
	
	
@PutMapping(path="/modify",consumes=MediaType.APPLICATION_JSON_VALUE,
produces=MediaType.APPLICATION_JSON_VALUE)
public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
	EmployeeResponse response=new EmployeeResponse();
	if(service.modifyEmployee(bean)) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("data modified successfully");
	}else {
		response.setStatuscode(405);
		response.setMessage("Failure");
		response.setDescription("data not modified successfully");
		
	}
	
	return response;
}//end of modifyEmployee


@DeleteMapping(path="/delete/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
	EmployeeResponse response=new EmployeeResponse();
	if(service.deleteEmployee(id)) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("data deleted successfully");
	}else {
		response.setStatuscode(401);
		response.setMessage("Failure");
		response.setDescription("data not deleted successfully");
		
	}
	return response;
}//end of deleteEmployee

@GetMapping(path="/get",
produces=MediaType.APPLICATION_JSON_VALUE)

public EmployeeResponse getEmployee(@RequestParam("id")int id) {
	EmployeeResponse response=new EmployeeResponse();
	EmployeeBean bean=service.getEmployee(id);
	if(bean!=null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("data found in successfully");
		response.setEmployeebean(Arrays.asList(bean));
	}else {
		response.setStatuscode(401);
		response.setMessage("Failure");
		response.setDescription("data not not found in successfully");
		
	}

	return response;
}//end of getEmployee


@GetMapping(path="/get-all",
produces=MediaType.APPLICATION_JSON_VALUE)
public EmployeeResponse getAllEmployee(){
	EmployeeResponse response=new EmployeeResponse();
	List<EmployeeBean> bean=service.getAllEmployee();
	if(!bean.isEmpty()) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("data found in successfully");
		response.setEmployeebean(bean);
	}else {
		response.setStatuscode(401);
		response.setMessage("Failure");
		response.setDescription("data not not found in successfully");
		
	}
	return response;
}//end of getAllEmployee
@GetMapping(path="/exce",produces=MediaType.APPLICATION_JSON_VALUE)
public void createException() {
	int i=1/0;
}
}
