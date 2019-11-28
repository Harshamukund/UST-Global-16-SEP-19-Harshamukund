package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Cource;
import com.ustglobal.jpawithhibernate.manytomany.Student;

public class ManyToMany {

	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction et=null;
		Cource c1=new Cource();
		c1.setCid(5);
		c1.setCname("selenium");
		
		Cource c2=new Cource();
		c2.setCid(6);
		c2.setCname("manualtesting");
		
		List<Cource> list=new ArrayList<Cource>();
		list.add(c1);
		list.add(c2);
		
		Student s1=new Student();
		s1.setSid(102);
		s1.setSname("bharath");
		s1.setCources(list);
		
		
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(s1);
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
	
		}

	}

}
