package com.ustglobal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="retailer")
public class RetailerBean {
	@Id
	@Column
	@GeneratedValue
	
	private int retailerid;
	@Column
	private String retailername;
	@Column
	private String email;
	@Column
	private String password;
	@OneToOne
	@JoinTable(name="orderid")
	private ProductBean productBean;
			public ProductBean getProductBean() {
		return productBean;
	}
	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}
			public int getRetailerid() {
		return retailerid;
	}
	public void setRetailerid(int retailerid) {
		this.retailerid = retailerid;
	}
	public String getRetailername() {
		return retailername;
	}
	public void setRetailername(String retailername) {
		this.retailername = retailername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
