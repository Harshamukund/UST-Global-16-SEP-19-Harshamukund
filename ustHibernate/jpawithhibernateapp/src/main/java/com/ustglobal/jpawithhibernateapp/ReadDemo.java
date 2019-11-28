package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		Product productdetail=entitymanager.find(Product.class, 101);
		System.out.println("Id "+productdetail.getPid());
		System.out.println("ProductName "+productdetail.getPname());
		System.out.println("Quantity "+productdetail.getQuantity());
	}

}
