package com.ustglobal.springboot.dto;

import java.util.List;

public class EmployeeResponse {
	private int statuscode;
	private String message;
	private String description;
	private List<EmployeeBean> employeebean;
	
	public List<EmployeeBean> getEmployeebean() {
		return employeebean;
	}
	public void setEmployeebean(List<EmployeeBean> employeebean) {
		this.employeebean = employeebean;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
