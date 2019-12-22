package com.ustglobal.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.BooksInventory;
import com.ustglobal.librarymanagement.dto.BooksRegistration;
import com.ustglobal.librarymanagement.dto.Users;
import com.ustglobal.librarymanagement.service.LibrarianService;
@RestController
public class LibrarianController {

	

	@Autowired
	private LibrarianService service ;

	@PostMapping("/addstudent")
	public boolean addStudent(@RequestBody Users users) {
		Users userss;
		boolean b;
		try {
			 service.registerStudent(users);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
		
		
	}// end of addStudent()

	@PostMapping("/library/librarian/create")
	public Boolean addBooks(@RequestBody BooksInventory booksInventory) {
		boolean isAdded = false;
		try {
			service.addBooks(booksInventory);
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isAdded;
	}// end of addBooks()

	@DeleteMapping("/library/librarian/{bookId}")
	public Boolean deleteBook(@PathVariable("bookId") int bookId) {
		boolean isDeleted = false;
		try {
			service.deleteBook(bookId);
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}// end of deleteBook()

	@GetMapping("/library/librarian/getBooks")
	public List<BooksInventory> showAllBook() {
		List<BooksInventory> bookList = null;
		try {
			bookList = service.showAllBooks();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}// end of showAllBooks()
	
	@GetMapping("/library/librarian/getStudent/{id}")
	public Users getStuentInfo(@PathVariable("id")int id) {
		Users users = null;
		try {
			users = service.getStudentInfo(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}// end of getStudentInfo()
	
	@DeleteMapping("/library/librarian/deleteStudent/{id}")
	public Boolean deleteStudent(@PathVariable("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteStudent(id);
		} catch (Exception e) {
		e.printStackTrace();
		}
		return isDeleted;
	}// end of deleteStudent()

	@GetMapping("/library/librarian/viewRequest")
	public List<BooksRegistration> viewRequests() {
		List<BooksRegistration> booksRegistrations = null;
		try {
			booksRegistrations = service.viewRequest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return booksRegistrations;
	}// end of viewRequest()
}
