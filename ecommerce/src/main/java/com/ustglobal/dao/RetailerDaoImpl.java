package com.ustglobal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.bean.ProductBean;
import com.ustglobal.bean.RetailerBean;


@Repository
public class RetailerDaoImpl implements RetailerDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	public RetailerBean login(int id, String password) {
		String jpql="from RetailerBean where retailerid=:id and password=:pass";
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(jpql,RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
		RetailerBean bean=(RetailerBean)query.getSingleResult();
		return bean;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	public int register(RetailerBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getRetailerid();
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
		
		
	}

		
	

	public ProductBean searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		ProductBean productBean = manager.find(ProductBean.class, id);

		
	
		return productBean;
	}

	
	public boolean changePassword(int id, String password) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		
		RetailerBean bean = manager.find(RetailerBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;	
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	return false;
	}


}
