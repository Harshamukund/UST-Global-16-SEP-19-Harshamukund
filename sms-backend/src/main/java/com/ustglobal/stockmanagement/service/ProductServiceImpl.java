package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.bean.OrderBean;
import com.ustglobal.stockmanagement.bean.ProductBean;
import com.ustglobal.stockmanagement.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProdct(ProductBean bean) {
		return dao.addProdct(bean);
	}

	@Override
	public boolean updateproduct(ProductBean bean) {
		return dao.updateproduct(bean);
	}

	@Override
	public boolean generateBill(List<ProductBean> beans,double total_price, double total_with_gst) {
		return dao.generateBill(beans, total_price, total_with_gst);
	}

	@Override
	public List<ProductBean> getAllProducts() {
		return dao.getAllProducts();
		}

}
