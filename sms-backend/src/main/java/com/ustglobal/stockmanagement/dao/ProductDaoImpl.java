package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.bean.OrderBean;
import com.ustglobal.stockmanagement.bean.ProductBean;

@Repository
public class ProductDaoImpl implements ProductDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProdct(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateproduct(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			ProductBean pBean = manager.find(ProductBean.class, bean.getPid());
			pBean.setCategory(bean.getCategory());
			pBean.setCompany(bean.getCompany());
			pBean.setName(bean.getName());
			pBean.setPrice(bean.getPrice());
			pBean.setQuantity(bean.getQuantity());
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean generateBill(List<ProductBean> beans, double total_price, double total_with_gst) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			for (ProductBean productBean : beans) {
				ProductBean bean= manager.find(ProductBean.class, productBean.getPid());
				int quantity = bean.getQuantity();
				bean.setQuantity(quantity-1);
				System.out.println(quantity);
			}
			OrderBean oBean = new OrderBean();
			oBean.setProductBeans(beans);
			oBean.setTotal_price(total_price);
			oBean.setTotal_price_with_gst(total_with_gst);
			manager.persist(oBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ProductBean> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductBean";
			TypedQuery<ProductBean> query = manager.createQuery(jpql, ProductBean.class);
			List<ProductBean> list = query.getResultList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
