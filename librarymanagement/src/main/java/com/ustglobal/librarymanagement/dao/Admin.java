package com.ustglobal.librarymanagement.dao;

import java.util.List;

import com.ustglobal.librarymanagement.dto.Users;

public interface Admin {
	public boolean addLibrarian(Users users);
	public boolean deleteLibrarian(int id);
	public List<Users> displayLibrarian();

	

}
