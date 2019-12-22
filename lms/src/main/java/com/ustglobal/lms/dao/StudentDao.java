package com.ustglobal.lms.dao;

import com.ustglobal.lms.dto.LoginBean;
import com.ustglobal.lms.dto.StudentBean;

public interface StudentDao {
	
	LoginBean register(StudentBean studentbean,LoginBean loginbean);
	

}
