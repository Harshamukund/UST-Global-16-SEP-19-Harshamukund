package com.ustglobal.lms.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="librarian")
public class LibrarianBean {
	@Id
	@Column
	@GeneratedValue
	private int lid;
	@Column
	private String name;
	@Column
	private long lmob;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="email")
	private LoginBean bean;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getLmob() {
		return lmob;
	}
	public void setLmob(long lmob) {
		this.lmob = lmob;
	}
	public LoginBean getBean() {
		return bean;
	}
	public void setBean(LoginBean bean) {
		this.bean = bean;
	}

}
