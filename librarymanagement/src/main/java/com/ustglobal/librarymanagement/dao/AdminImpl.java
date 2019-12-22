package com.ustglobal.librarymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.Users;
@Repository
public class AdminImpl implements Admin {
	@PersistenceUnit
private EntityManagerFactory FACTORY ;

	@Override
	public boolean addLibrarian(Users users) {
		
		
		
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(users);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteLibrarian(int id) {

		boolean isDeleted = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			Users user = manager.find(Users.class, id);
			manager.getTransaction().begin();
			manager.remove(user);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;	
	}

	@Override
	public List<Users> displayLibrarian() {

		List<Users> userList = null;
		 try {
			 EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<Users> typedQuery = manager.createQuery("FROM Users WHERE type = 'Librarian'", Users.class);
			 userList = typedQuery.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	

}
