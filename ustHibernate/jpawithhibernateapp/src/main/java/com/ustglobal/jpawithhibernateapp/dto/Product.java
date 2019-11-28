package com.ustglobal.jpawithhibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //to make class as entity class use @entity annotation
@Table(name="product") //to specify that the table name is product we use@table annotation 
public class Product {
	@Id  //to specity that this datamember is primary key we use @Id annotation
	@Column //to tell that it is a column of a table
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	@Column
	
	private String pname;
	@Column
	private int quantity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
