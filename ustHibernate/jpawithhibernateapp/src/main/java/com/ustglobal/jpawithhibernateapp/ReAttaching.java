package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReAttaching {

	public static void main(String[] args) {
		
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			Product p=em.find(Product.class, 101);
			System.out.println(" object is present or not "+em.contains(p));
			em.detach(p);
			System.out.println(" object is present or not "+em.contains(p));
			Product p1=em.merge(p);
			
			
			p1.setPname("laptop");
			System.out.println("row updated");
			et.commit();
					
			
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	
		

	}

}
