package com.ustglobal.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.Login;
import com.ustglobal.librarymanagement.dto.Users;
import com.ustglobal.librarymanagement.validation.Validation;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private Login dao;

	Validation validation = new Validation();
	@Override
	public Users login(Users users) {

		if(users!= null) {
			validation.validatePassword(users.getPassword());
			return dao.login(users);
		}
		return null;
		
	}

}
