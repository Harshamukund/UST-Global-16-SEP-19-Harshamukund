package com.ustglobal.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.sample.dto.EmployeeDetails;

public class Delete {

	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction et=null;
		
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sample");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			EmployeeDetails ed=em.find(EmployeeDetails.class, 1);
			em.remove(ed);
			System.out.println("record removed");
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();

	}

}
