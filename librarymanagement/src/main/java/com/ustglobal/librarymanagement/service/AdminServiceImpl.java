package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.Admin;
import com.ustglobal.librarymanagement.dto.Users;
import com.ustglobal.librarymanagement.validation.Validation;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private Admin dao;

	Validation validation = new Validation();
	@Override
	public boolean addLibrarian(Users users) {

		if(users!= null) {
			validation.validateEmail(users.getEmail());
			validation.validatePassword(users.getPassword());
			return dao.addLibrarian(users);
		}
		return true;
	}

	@Override
	public boolean deleteLibrarian(int id) {
		return dao.deleteLibrarian(id);
	}

	@Override
	public List<Users> displayLibrarian() {
		return dao.displayLibrarian();
	}

}
