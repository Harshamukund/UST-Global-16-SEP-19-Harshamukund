package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {

	public static void main(String[] args) {
		EntityManager entitymanager=null;
		 EntityTransaction entitytransaction=null;
		try {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
		 entitymanager=entitymanagerfactory.createEntityManager();
		  entitytransaction=entitymanager.getTransaction();
		 entitytransaction.begin();
		String jpql="delete from Product where id=:pid";
		Query q=entitymanager.createQuery(jpql);
		q.setParameter("pid", 101);
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
