package com.ustglobal.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.springrest.dto.EmployeeBean;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@PersistenceUnit
private EntityManagerFactory factory;
	@Override
	public boolean addEmploee(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
		
		
		
			}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		EmployeeBean employeebean=manager.find(EmployeeBean.class, bean.getId());
		
		employeebean.setName(bean.getName());
		employeebean.setPassword(bean.getPassword());
		employeebean.setDoj(bean.getDoj());
		employeebean.setGender(bean.getGender());
		transaction.commit();
		return true;
			}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		EmployeeBean bean=manager.find(EmployeeBean.class, id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		EmployeeBean bean=manager.find(EmployeeBean.class, id);
		return bean;
		
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		String jpql="from EmployeeBean";
		
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createQuery(jpql,EmployeeBean.class);
		List<EmployeeBean> employeebean=query.getResultList();
		return employeebean;
		
			}

}
