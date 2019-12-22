package com.ustglobal.springboot.service;

import java.util.List;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeService {
	
	public boolean addEmploee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployee();



}
