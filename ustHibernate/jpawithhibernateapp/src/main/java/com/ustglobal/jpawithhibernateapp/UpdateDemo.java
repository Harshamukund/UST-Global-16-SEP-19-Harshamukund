package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class UpdateDemo {
	
	
	
	
	public static void main(String[] args) {
		EntityManager entitymanager=null;
		 EntityTransaction entitytransaction=null;
		try {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
		 entitymanager=entitymanagerfactory.createEntityManager();
		  entitytransaction=entitymanager.getTransaction();
		 entitytransaction.begin();
		 Product productdetail=entitymanager.find(Product.class, 101);
		 productdetail.setPname("Mobile");
		 System.out.println("updated record");
		 entitytransaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			entitytransaction.rollback();
			
			// TODO: handle exception
		}
		 entitymanager.close();
		 

	}

}
