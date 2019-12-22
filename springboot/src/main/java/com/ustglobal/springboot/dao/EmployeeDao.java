package com.ustglobal.springboot.dao;

import java.util.List;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeDao {
	public boolean addEmploee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployee();


	

}
