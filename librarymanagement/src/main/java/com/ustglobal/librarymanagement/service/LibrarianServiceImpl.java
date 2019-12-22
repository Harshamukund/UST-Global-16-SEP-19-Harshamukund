package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.Librarian;
import com.ustglobal.librarymanagement.dto.BooksInventory;
import com.ustglobal.librarymanagement.dto.BooksRegistration;
import com.ustglobal.librarymanagement.dto.Users;
import com.ustglobal.librarymanagement.validation.Validation;

@Service
public class LibrarianServiceImpl implements LibrarianService{
	@Autowired
	private Librarian dao;

	Validation validation = new Validation();
	@Override
	public boolean registerStudent(Users user) {
		if(user!= null) {
			validation.validateEmail(user.getEmail());
			validation.validatePassword(user.getPassword());
			return dao.registerStudent(user);
		}
		return true;
	}

	@Override
	public boolean deleteStudent(int id) {

		return dao.deleteStudent(id);
	}

	@Override
	public boolean addBooks(BooksInventory booksInventory) {

		return dao.addBooks(booksInventory);
	}

	@Override
	public boolean deleteBook(int bookId) {
		return dao.deleteBook(bookId);
	}

	@Override
	public Users getStudentInfo(int id) {

		return dao.getStudentInfo(id);
	}

	@Override
	public List<BooksRegistration> viewRequest() {

		return dao.viewRequest();
	}

	@Override
	public List<BooksInventory> showAllBooks() {

		return dao.showAllBooks();
		
	}

}
