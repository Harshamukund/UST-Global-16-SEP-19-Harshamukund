package com.ustglobal.service;

import com.ustglobal.bean.ProductBean;
import com.ustglobal.bean.RetailerBean;

public interface RetailerService {
	
	public RetailerBean login(int id,String password);
	public int register(RetailerBean bean);

	public ProductBean searchProduct(int id);

	public boolean changePassword(int id,String password);
	
	


}
