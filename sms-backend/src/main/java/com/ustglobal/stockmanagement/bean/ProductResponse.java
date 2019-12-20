package com.ustglobal.stockmanagement.bean;

import java.util.List;

public class ProductResponse {

	private int status_code;
	
	private String message;
	
	private List<ProductBean> bean;
	
	private List<OrderBean> orderBeans;

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ProductBean> getBean() {
		return bean;
	}

	public void setBean(List<ProductBean> bean) {
		this.bean = bean;
	}

	public List<OrderBean> getOrderBeans() {
		return orderBeans;
	}

	public void setOrderBeans(List<OrderBean> orderBeans) {
		this.orderBeans = orderBeans;
	}
	
}
