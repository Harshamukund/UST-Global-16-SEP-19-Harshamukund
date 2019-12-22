package com.ustglobal.lms.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

@Repository
public class LibrarianDaoImpl implements LibrarianDao {
	
			@PersistenceUnit
		private EntityManagerFactory factory;
		

	}



