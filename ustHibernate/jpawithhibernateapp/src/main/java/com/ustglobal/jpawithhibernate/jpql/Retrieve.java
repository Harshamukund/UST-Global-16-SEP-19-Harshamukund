package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class Retrieve {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em=emf.createEntityManager();
		String jpql="select pname from Product";
		Query q=em.createQuery(jpql);
		List<Product> l=q.getResultList();
		for(Product p:l)
		{
			System.out.print(p.getPid()+" ");
			System.out.print(p.getPname());
			System.out.print(p.getQuantity());
		}
		

	}

}
