package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReference {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		Product productdetail=entitymanager.getReference(Product.class, 101);//not hit the database ,untill we use get or set the data(using getter or setters method) from database 
		System.out.println(productdetail);//it will return proxy object
		System.out.println("Id "+productdetail.getPid());//hit the database because we are getting data
		System.out.println("ProductName "+productdetail.getPname());//hit the database
		System.out.println("Quantity "+productdetail.getQuantity());//hit the database
		entitymanager.close();

	}

}
