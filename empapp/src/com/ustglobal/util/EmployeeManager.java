package com.ustglobal.util;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDaoImpl;

public class EmployeeManager {
	private EmployeeManager() {
		
	}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoImpl();
	}

}
