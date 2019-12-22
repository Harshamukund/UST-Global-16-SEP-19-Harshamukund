package com.ustglobal.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.BooksInventory;
import com.ustglobal.librarymanagement.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/library/librarian/getBooks/")
	public List<BooksInventory> searchBook(@RequestBody BooksInventory booksInventory) {
		List<BooksInventory> bookList = null;
		try {
			bookList = service.searchBook(booksInventory);
		} catch (Exception e) {
			e.printStackTrace();;
		}
		return bookList;
	}// end of searchBook()
	
	@GetMapping("library/student/book/request/{bookId}")
	public Boolean requestBook(@PathVariable("bookId") int bookId) {
		boolean isRequested = false;
		try {
			service.requestBook(bookId);
			isRequested = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isRequested;
	}// end of requestBook()
}
