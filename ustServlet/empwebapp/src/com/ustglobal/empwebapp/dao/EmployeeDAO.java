package com.ustglobal.empwebapp.dao;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

public interface EmployeeDAO {
	public EmployeeInfo searchEmployee(int id);
	public EmployeeInfo auth(int id,String password);
	public boolean changePassword(int id,String password);
	public boolean registerEmployee(EmployeeInfo info);

}
