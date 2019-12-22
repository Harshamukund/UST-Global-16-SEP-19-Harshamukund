package com.ustglobal.lms.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.StudentBean;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public LoginBean register(StudentBean studentbean, LoginBean loginbean) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
