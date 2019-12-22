package com.ustglobal.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springboot.dao.EmployeeDao;
import com.ustglobal.springboot.dto.EmployeeBean;
//@Service
public class EmployeeServiceImpl implements EmployeeService {

//	@Autowired
	private EmployeeDao dao;
	@Override
	public boolean addEmploee(EmployeeBean bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		// TODO Auto-generated method stub
		return dao.addEmploee(bean);
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}

		// TODO Auto-generated method stub
		return dao.modifyEmployee(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

}
