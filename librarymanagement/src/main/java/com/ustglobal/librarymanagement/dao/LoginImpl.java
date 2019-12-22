package com.ustglobal.librarymanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.Users;
@Repository
public class LoginImpl implements Login{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Users login(Users users) {
		if(users!=null) {
			EntityManager manager=factory.createEntityManager();
			Query query=manager.createQuery("From Users Where id=:id and password=:pass");
			query.setParameter("id", users.getId());
			query.setParameter("pass", users.getPassword());
			Users us=(Users) query.getSingleResult();
			return us;
			
		}
		else {
			return null;
			
		}
		
	}
	
		

		
			

}
