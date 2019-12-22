package com.ustglobal.librarymanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.BooksInventory;
import com.ustglobal.librarymanagement.dto.BooksRegistration;
@Repository
public class StudentImpl implements Student{
	@PersistenceUnit
	private EntityManagerFactory FACTORY;

	@Override
	public List<BooksInventory> searchBook(BooksInventory booksInventory) {
		List<BooksInventory> booksInventories = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<BooksInventory> query = manager.createQuery("FROM BooksInventory WHERE bookName = :bName and author1 =:author", BooksInventory.class);
			query.setParameter("bName", booksInventory.getBookName());
			query.setParameter("author", booksInventory.getAuthor1());
			booksInventories = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return booksInventories;
	}

	@Override
	public Boolean requestBook(int bookId) {
		BooksRegistration booksRegistration = new BooksRegistration();
	
		booksRegistration.setBookid(bookId);
		booksRegistration.setRegistrationdate(new Date());
		Random random = new Random();
		booksRegistration.setRegistrationid(random.nextInt(10000));
		boolean isRequested = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(booksRegistration);
			manager.getTransaction().commit();
			isRequested = true;
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();;
		}
		return isRequested;
		
	}

}
