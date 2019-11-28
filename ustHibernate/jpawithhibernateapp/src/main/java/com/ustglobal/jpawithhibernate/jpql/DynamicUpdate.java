package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {

	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			String jpql="update Product Set pname=:name,quantity=:pquantity where pid=:id";
			Query q=em.createQuery(jpql);
			q.setParameter("name", "Book");
			q.setParameter("pquantity", 50);
			q.setParameter("id", 105);
			int result=q.executeUpdate();
			
			
			
			System.out.println(result+" rows updated");
			et.commit();
				
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();


	}

}
