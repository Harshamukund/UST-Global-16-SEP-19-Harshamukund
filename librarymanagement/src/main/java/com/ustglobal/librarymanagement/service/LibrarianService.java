package com.ustglobal.librarymanagement.service;

import java.util.List;

import com.ustglobal.librarymanagement.dto.BooksInventory;
import com.ustglobal.librarymanagement.dto.BooksRegistration;
import com.ustglobal.librarymanagement.dto.Users;

public interface LibrarianService {

	public boolean registerStudent(Users user);
	public boolean deleteStudent(int id) ;
	public boolean addBooks(BooksInventory booksInventory) ;
	public boolean deleteBook(int bookId) ;
	public Users getStudentInfo(int id) ;
	public List<BooksRegistration> viewRequest();
	public List<BooksInventory> showAllBooks() ;

	

}
