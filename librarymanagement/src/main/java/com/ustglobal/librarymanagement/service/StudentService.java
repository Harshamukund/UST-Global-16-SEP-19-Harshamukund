package com.ustglobal.librarymanagement.service;

import java.util.List;

import com.ustglobal.librarymanagement.dto.BooksInventory;

public interface StudentService {

	public List<BooksInventory> searchBook(BooksInventory booksInventory) ;
	public Boolean requestBook(int bookId) ;

}
