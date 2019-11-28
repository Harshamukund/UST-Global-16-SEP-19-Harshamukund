package com.ustglobal.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.sample.dto.EmployeeDetails;

public class Insert {

	public static void main(String[] args) {
		EmployeeDetails details=new EmployeeDetails();
		details.setId(2);
		details.setEname("Hemanth");
		details.setSalary("40000");
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sample");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(details);
			System.out.println("record saved");
			et.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
		

	}

}
