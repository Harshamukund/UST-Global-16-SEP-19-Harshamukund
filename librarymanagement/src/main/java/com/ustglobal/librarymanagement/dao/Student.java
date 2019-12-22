package com.ustglobal.librarymanagement.dao;

import java.util.List;

import com.ustglobal.librarymanagement.dto.BooksInventory;

public interface Student {
	public List<BooksInventory> searchBook(BooksInventory booksInventory) ;
	public Boolean requestBook(int bookId) ;

}
