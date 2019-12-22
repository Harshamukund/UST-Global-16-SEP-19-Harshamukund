package com.ustglobal.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.service.LibrarianService;

@RestController
public class LibraryController {
	@Autowired
	private LibrarianService libservice;

}
