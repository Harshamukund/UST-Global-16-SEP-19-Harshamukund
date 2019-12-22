package com.ustglobal.librarymanagement.service;

import java.util.List;

import com.ustglobal.librarymanagement.dto.Users;

public interface AdminService {
	
	public boolean addLibrarian(Users users);
	public boolean deleteLibrarian(int id);
	public List<Users> displayLibrarian();

	


}
