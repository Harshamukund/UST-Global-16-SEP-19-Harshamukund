package com.ustglobal.dao;

import com.ustglobal.bean.ProductBean;
import com.ustglobal.bean.RetailerBean;


public interface RetailerDao {
	
	public RetailerBean login(int id,String password);
	public int register(RetailerBean bean);

	public ProductBean searchProduct(int id);

	public boolean changePassword(int id,String password);
	
	

}
