package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobaljpawithhibernate.onetomany.Pencil;
import com.ustglobaljpawithhibernate.onetomany.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {
		PencilBox box=new PencilBox();
		box.setPbid(105);
		box.setPbname("apsara");
		Pencil p=new Pencil();
		p.setPid(5);
		p.setPcolor("red");
		p.setPb(box);
		Pencil p2=new Pencil();
		p2.setPid(6);
		p2.setPcolor("black");
		p2.setPb(box);
		
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			et=em.getTransaction();
			
			et.begin();
			em.persist(p);
			em.persist(p2);

			
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();



	}

}
