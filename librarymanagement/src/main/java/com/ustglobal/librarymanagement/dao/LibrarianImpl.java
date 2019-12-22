package com.ustglobal.librarymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.BooksInventory;
import com.ustglobal.librarymanagement.dto.BooksRegistration;
import com.ustglobal.librarymanagement.dto.Users;
@Repository
public class LibrarianImpl implements Librarian {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean registerStudent(Users user) {
	
		
		
		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(user);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;	
	}

	@Override
	public boolean deleteStudent(int id) {

		boolean isDeleted = false;
		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			Users users = manager.find(Users.class, id);
			manager.remove(users);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public boolean addBooks(BooksInventory booksInventory) {
		boolean isAdded = false;
		
		
		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(booksInventory);
			manager.getTransaction().commit();
			isAdded = true;
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isAdded;
	}

	@Override
	public boolean deleteBook(int bookId) {

		boolean isDeleted = false;
		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			BooksInventory booksInventory = manager.find(BooksInventory.class, bookId);
			manager.remove(booksInventory);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public Users getStudentInfo(int id) {

		Users users = null;
		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			users = manager.find(Users.class, id);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;	
	}

	@Override
	public List<BooksRegistration> viewRequest() {

		List<BooksRegistration> booksRegistrations = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<BooksRegistration> typedQuery = manager.createQuery("FROM BooksRegistration", BooksRegistration.class);
			 booksRegistrations = typedQuery.getResultList();
			 manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return booksRegistrations;
	}

	@Override
	public List<BooksInventory> showAllBooks() {

		List<BooksInventory> booksInventories = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<BooksInventory> query = manager.createQuery("FROM BooksInventory", BooksInventory.class);
			booksInventories = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return booksInventories;
	
	}
}