package com.ustglobal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.bean.ProductBean;
import com.ustglobal.bean.RetailerBean;
import com.ustglobal.dao.RetailerDao;
@Service
public class RetailerServiceImpl implements RetailerService{
@Autowired
	private RetailerDao dao;
	public RetailerBean login(int id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}

	public int register(RetailerBean bean) {
		// TODO Auto-generated method stub
		return dao.register(bean);
	}

	public ProductBean searchProduct(int id) {
		// TODO Auto-generated method stub
		return dao.searchProduct(id);
	}

	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, password);
	}

}
