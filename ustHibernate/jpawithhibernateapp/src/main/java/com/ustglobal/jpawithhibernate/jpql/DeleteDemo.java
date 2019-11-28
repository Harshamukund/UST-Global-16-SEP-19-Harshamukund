package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class DeleteDemo {

	public static void main(String[] args) {
		EntityManager entitymanager=null;
		 EntityTransaction entitytransaction=null;
		try {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
		 entitymanager=entitymanagerfactory.createEntityManager();
		  entitytransaction=entitymanager.getTransaction();
		 entitytransaction.begin();
		String jpql="delete from Product where id=101";
		Query q=entitymanager.createQuery(jpql);
		int value=q.executeUpdate();
		
		 System.out.println(value+" Record Removed");
		 entitytransaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			entitytransaction.rollback();
			
			
		}
		entitymanager.close();
		 


	}

}
