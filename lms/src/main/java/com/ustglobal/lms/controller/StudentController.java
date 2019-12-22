package com.ustglobal.lms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studservice;
	
	@PostMapping(path="/studentregister",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean register(@RequestBody StudentBean studentbean) {
		
		return true;
	}

}
