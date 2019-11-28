package com.ustglobal.empwebapp.util;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {
	private EmployeeDaoManager() {

}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}