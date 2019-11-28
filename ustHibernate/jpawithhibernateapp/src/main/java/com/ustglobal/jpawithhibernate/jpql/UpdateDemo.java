package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			String jpql="update Product Set pname='sandals',quantity=30 where pid=101";
			Query q=em.createQuery(jpql);
			int x=q.executeUpdate();
			System.out.println(x+" rows updated");
			et.commit();
				
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}

}
