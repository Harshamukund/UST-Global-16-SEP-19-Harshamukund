package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.bean.OrderBean;
import com.ustglobal.stockmanagement.bean.ProductBean;

public interface ProductDAO {
	public boolean addProdct(ProductBean bean);
	public boolean updateproduct(ProductBean bean);
	public boolean generateBill(List<ProductBean> beans,double total_price,double price_with_gst);
	public List<ProductBean> getAllProducts();
}
