package com.ustglobal.lms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="login")
public class LoginBean {
	@Id
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String type;
	@OneToOne(mappedBy="loginbean")
	@Exclude
	
	private StudentBean studentbean;
	
	@OneToOne(mappedBy="bean")
	@Exclude
	private LibrarianBean librarianbean;
	
	public LibrarianBean getLibrarianbean() {
		return librarianbean;
	}
	public void setLibrarianbean(LibrarianBean librarianbean) {
		this.librarianbean = librarianbean;
	}
	public StudentBean getStudentbean() {
		return studentbean;
	}
	public void setStudentbean(StudentBean studentbean) {
		this.studentbean = studentbean;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
