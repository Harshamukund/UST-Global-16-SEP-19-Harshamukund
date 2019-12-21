package com.ustglobal.mailapp.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;




import com.ustglobal.mailapp.dto.MailBean;
import com.ustglobal.mailapp.dto.UserBean;
@Repository
public class UserDaoIMPL implements UserDAO {
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean registerUser(UserBean user) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
			return false;
		}

	}

	@Override
	public UserBean loginUser(String email, String password) {
		String jpql = "from UserBean where email=:email and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
		query.setParameter("email", email);
		query.setParameter("password",password);
		UserBean bean = query.getSingleResult();
		if(bean != null) {
			return bean;
		} else {
			return null;
		}
	}

	@Override
	public UserBean forgotPassowrd(String email, String question, String answer) {
		EntityManager manager = factory.createEntityManager();
		String jpql="from UserBean where email=:email and securityQuestion=:question and answer=:answer ";
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
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		String jpql="from UserBean where email=:email and password=:password";
		try {
			//			TypedQuery<UserBean>query=manager.createQuery(jpql, UserBean.class);
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
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql1 = "from UserBean where email=:email";

		Query que1 = manager.createQuery(jpql1);
		que1.setParameter("email", email);
		UserBean user_to = (UserBean)que1.getSingleResult();

		UserBean user_from = manager.find(UserBean.class, id);

		try {
			transaction.begin();
			MailBean bean = new MailBean();
			bean.setMessage(message);
			bean.setSubject(subject);
			bean.setStatus("sent");

			bean.setUserbean(user_from);
			bean.setUser(user_to);
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
	public List<MailBean> inbox(int to_id) {
		// TODO Auto-generated method stub
		String jpql = "from EmailBean where to_id=:to_id";
		EntityManager manager = factory.createEntityManager();
		
		try {
			TypedQuery<MailBean> email = manager.createQuery(jpql, MailBean.class);
			email.setParameter("to_id", to_id);
			List<MailBean> list = (List<MailBean>)email.getResultList();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		//       Query email = manager.createQuery(jpql);

	}

	@Override
	public List<MailBean> send(int from_id) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		String jpql = "from EmailBean where from_id=:from_id";
		TypedQuery<MailBean> email = manager.createQuery(jpql, MailBean.class);
		email.setParameter("from_id" ,from_id );
		List<MailBean> list = email.getResultList();
		if(list!=null)
			return list;
		else 
			return null;

	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			MailBean bean =manager.find(MailBean.class,id);
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
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql1 = "from UserBean where email=:email";

		Query que1 = manager.createQuery(jpql1);
		que1.setParameter("email", email);
		UserBean user_to = (UserBean)que1.getSingleResult();

		UserBean user_from = manager.find(UserBean.class, id);

		try {
			transaction.begin();
			MailBean bean = new MailBean();
			bean.setMessage(message);
			bean.setSubject(subject);
			bean.setStatus("draft");
			bean.setUserbean(user_from);
			bean.setUser(user_to);
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
	public List<MailBean> draftlist(int to_id, String status) {
		// TODO Auto-generated method stub
		String jpql = "from EmailBean where to_id=:to_id and status=:status";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<MailBean> bean = manager.createQuery(jpql,MailBean.class);
		bean.setParameter("to_id", to_id);
		bean.setParameter("status", status);
		List<MailBean> email = bean.getResultList();
		return email;
	}

	@Override
	public boolean deleteInbox(int id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		MailBean bean=manager.find(MailBean.class, id);
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
