package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;
import com.ustglobal.jpawithhibernateapp.dto.Product;

public class TestOneToOne {

	public static void main(String[] args) {
		VoterCard card=new VoterCard();
		card.setVid(30);
		card.setVname("sham");
		Person p=new Person();
		p.setPid(2);
		p.setName("sham");
		p.setCard(card);
		
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			et=em.getTransaction();
			
			et.begin();
			//em.persist(p);
			VoterCard vc=em.find(VoterCard.class, 30);
			System.out.println(vc.getPer().getPid());
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();

	}

}
