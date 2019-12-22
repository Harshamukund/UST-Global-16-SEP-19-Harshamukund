package com.ustglobal.gmail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.gmail.dto.GmailBean;
import com.ustglobal.gmail.dto.UserBean;
@Repository
public class GmailDaoIMPL implements GmailDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	private EntityManager manager = null;
	private EntityTransaction transaction = null;
	@Override
	public boolean registerUser(UserBean user) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}

	}

	@Override
	public UserBean loginUser(UserBean bean1) {
		
		String jpql = "from UserBean where email=:email and password=:password";
		manager = factory.createEntityManager();
		TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
		query.setParameter("email", bean1.getEmail());
		query.setParameter("password",bean1.getPassword());
		UserBean bean = query.getSingleResult();
		if(bean != null) {
			return bean;
		} else {
			return null;
		}
	}

	@Override
	public UserBean forgotPassowrd(String email, String question, String answer) {
		manager = factory.createEntityManager();
		String jpql="from UserBean where email=:email and question=:question and ans=:answer ";
		try {
			TypedQuery<UserBean> query=manager.createQuery(jpql, UserBean.class);
			query.setParameter("email",email);
			query.setParameter("question",question);
			query.setParameter("answer",answer);

			UserBean dto = (UserBean)query.getSingleResult();
			if(dto != null) {
				return dto;
			}else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean changePassword(String email, String password,String newPassword) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		String jpql="from UserBean where email=:email and password=:password";
		try {
			Query query =  manager.createQuery(jpql);
			query.setParameter("email",email);
			query.setParameter("password",password);
			UserBean dto = (UserBean)query.getSingleResult();
			if(dto != null) {
				transaction.begin();
				dto.setPassword(newPassword);
				manager.persist(dto);
				transaction.commit();
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean compose(String subject, String message, String email,int id) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		String jpql1 = "from UserBean where email=:email";

		Query que1 = manager.createQuery(jpql1);
		que1.setParameter("email", email);
		UserBean user_to = (UserBean)que1.getSingleResult();

		UserBean user_from = manager.find(UserBean.class, id);

		try {
			transaction.begin();
			GmailBean bean = new GmailBean();
			bean.setMessage(message);
			bean.setSubject(subject);
			bean.setStatus("sent");

			bean.setUserbean(user_from);
			bean.setUser(user_to);
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<GmailBean> inbox(int to_id) {
		String jpql = "from EmailBean where to_id=:to_id";
		manager = factory.createEntityManager();
		try {
			TypedQuery<GmailBean> email = manager.createQuery(jpql, GmailBean.class);
			email.setParameter("to_id", to_id);
			List<GmailBean> list = (List<GmailBean>)email.getResultList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<GmailBean> send(int from_id) {
		manager = factory.createEntityManager();
		String jpql = "from EmailBean where from_id=:from_id";
		TypedQuery<GmailBean> email = manager.createQuery(jpql, GmailBean.class);
		email.setParameter("from_id" ,from_id );
		List<GmailBean> list = email.getResultList();
		if(list!=null)
			return list;
		else 
			return null;

	}

	@Override
	public boolean delete(int id) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		try {
			GmailBean bean =manager.find(GmailBean.class,id);
			bean.setStatus("deleted");
			transaction.commit();
			return true;

		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	
	@Override
	public boolean draft(String subject, String message, String email, int id) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		String jpql1 = "from UserBean where email=:email";

		Query que1 = manager.createQuery(jpql1);
		que1.setParameter("email", email);
		UserBean user_to = (UserBean)que1.getSingleResult();

		UserBean user_from = manager.find(UserBean.class, id);

		try {
			transaction.begin();
			GmailBean bean = new GmailBean();
			bean.setMessage(message);
			bean.setSubject(subject);
			bean.setStatus("draft");
			bean.setUserbean(user_from);
			bean.setUser(user_to);
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<GmailBean> draftlist(int to_id, String status) {
		String jpql = "from EmailBean where to_id=:to_id and status=:status";
		manager = factory.createEntityManager();
		TypedQuery<GmailBean> bean = manager.createQuery(jpql,GmailBean.class);
		bean.setParameter("to_id", to_id);
		bean.setParameter("status", status);
		List<GmailBean> email = bean.getResultList();
		return email;
	}

	@Override
	public boolean deleteInbox(int id) {
		
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		try {
		transaction.begin();
		GmailBean bean=manager.find(GmailBean.class, id);
		manager.remove(bean);
		transaction.commit();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

}
