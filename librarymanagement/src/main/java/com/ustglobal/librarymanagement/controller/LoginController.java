package com.ustglobal.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.Users;
import com.ustglobal.librarymanagement.service.LoginService;
@RestController
public class LoginController {

	
	@Autowired
	private LoginService service ;
	
	@PostMapping("/login")
	public Users login(@RequestBody Users users) {
		 Users user = null;
		try {
			user = service.login(users);
		} catch (Exception e) {
			e.printStackTrace();;
		}
		return user;
	}// end of login()
}
