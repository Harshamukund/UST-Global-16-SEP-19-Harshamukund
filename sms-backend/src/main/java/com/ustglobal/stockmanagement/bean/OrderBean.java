package com.ustglobal.stockmanagement.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "order_info")
public class OrderBean {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	@Column
	private double total_price;
	@Column
	private double total_price_with_gst;
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "order_history_info", joinColumns = @JoinColumn( name= "oid"),
	inverseJoinColumns = @JoinColumn(name = "pid"))
	private List<ProductBean> productBeans;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public double getTotal_price_with_gst() {
		return total_price_with_gst;
	}
	public void setTotal_price_with_gst(double total_price_with_gst) {
		this.total_price_with_gst = total_price_with_gst;
	}
	public List<ProductBean> getProductBeans() {
		return productBeans;
	}
	public void setProductBeans(List<ProductBean> productBeans) {
		this.productBeans = productBeans;
	}
	
}
