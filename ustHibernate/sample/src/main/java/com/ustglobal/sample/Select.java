package com.ustglobal.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.sample.dto.EmployeeDetails;

public class Select {

	public static void main(String[] args) {

		EmployeeDetails details=new EmployeeDetails();



		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sample");
		EntityManager	em=emf.createEntityManager();
		em.persist(details);
		details=em.find(EmployeeDetails.class, 1);
		System.out.println("employee id is "+details.getId());
		System.out.println("employee name is "+details.getEname());
		System.out.println("employee salary is "+details.getSalary());
		em.close();

	}




}


