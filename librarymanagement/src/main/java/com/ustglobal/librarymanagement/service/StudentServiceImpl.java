package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.Student;
import com.ustglobal.librarymanagement.dto.BooksInventory;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private Student dao;

	@Override
	public List<BooksInventory> searchBook(BooksInventory booksInventory) {
		return dao.searchBook(booksInventory);
	}

	@Override
	public Boolean requestBook(int bookId) {

		return dao.requestBook(bookId);
	}

}
