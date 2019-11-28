package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsetDemo {

	public static void main(String[] args) {
		Product info=new Product();
		info.setPid(101);
		info.setPname("pen");
		info.setQuantity(10);
				EntityManager entitymanager=null;
				EntityTransaction entitytransaction=null;
		
		try {
			EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
		 entitymanager=entitymanagerfactory.createEntityManager();
		 entitytransaction=entitymanager.getTransaction();
		entitytransaction.begin();
		entitymanager.persist(info);
		//System.out.println(entitymanager.contains(info));
		System.out.println("Record Saved");
		entitytransaction.commit();
		}
		catch (Exception e) {
			
		e.printStackTrace();
		entitytransaction.rollback();
		
		}
		entitymanager.close();
	}

}
