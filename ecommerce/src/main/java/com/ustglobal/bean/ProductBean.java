package com.ustglobal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductBean {
	@Id
	@Column
	@GeneratedValue
	private int orderid;
	
	@Column
	private String productname;

	@Column
	private int priceperunit;
	@Column
	private int quantity;
	@Column
	private int amountpayable;
	@Column
	private int retailerid;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPriceperunit() {
		return priceperunit;
	}
	public void setPriceperunit(int priceperunit) {
		this.priceperunit = priceperunit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmountpayable() {
		return amountpayable;
	}
	public void setAmountpayable(int amountpayable) {
		this.amountpayable = amountpayable;
	}
	public int getRetailerid() {
		return retailerid;
	}
	public void setRetailerid(int retailerid) {
		this.retailerid = retailerid;
	}
	

}
