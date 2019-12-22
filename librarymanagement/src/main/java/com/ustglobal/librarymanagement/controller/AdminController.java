package com.ustglobal.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.Users;
import com.ustglobal.librarymanagement.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService service;

	@DeleteMapping("library/admin/deleteLibrarian/{id}")
	public Boolean deleteLibrarian(@PathVariable ("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteLibrarian(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}// end of deleteLibrarian()
	
	
	@PostMapping("/addlibrarian")
	public boolean addLibrarian(@RequestBody Users users) {
		System.out.println(users);
		try {
			 service.addLibrarian(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}// end of addLibrarian()
	
	
	@GetMapping("library/admin/displayLibrarian")
	public List<Users> displayeLibrarian(){
		List<Users> usersList = null;
		try {
			usersList = service.displayLibrarian();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usersList;
	}// end of displayeLibrarian()
	
	
}
