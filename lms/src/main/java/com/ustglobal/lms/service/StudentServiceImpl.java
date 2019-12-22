package com.ustglobal.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.StudentDao;
import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.StudentBean;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;
	
}
