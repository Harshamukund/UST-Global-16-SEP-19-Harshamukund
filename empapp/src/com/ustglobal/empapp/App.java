package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDaoImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		
			System.out.println("press1 to get all the employee data");
			System.out.println("press2 to insert the employee data");
			System.out.println("press3 to update  the employee data");
			System.out.println("press4 to delete employee data");
			System.out.println("press5 to search single employee  data");
			
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch(ch){
			case 1:
				EmployeeDAO dao=EmployeeManager.getEmployeeDAO();
				List<EmployeeBean> result=dao.getAllEmployeeData();
				for(EmployeeBean bean:result) {
					System.out.println("Id : "+bean.getId());
					System.out.println("Name : "+bean.getName());
					System.out.println("Salary : "+bean.getSalary());
					System.out.println("Gender : "+bean.getGender());
				}
				break;
			case 2:EmployeeDAO dao2=EmployeeManager.getEmployeeDAO();
			System.out.println("enter id: ");
			int id1=sc.nextInt();
			EmployeeBean bean=dao2.searchEmployeeData(id1);
			if(bean!=null) {
				System.out.println("Id : "+bean.getId());
				System.out.println("Name : "+bean.getName());
				System.out.println("Salary : "+bean.getSalary());
				System.out.println("Gender : "+bean.getGender());
			}
			else {
				System.out.println("no data found");

				
			}

			break;
			case 3:
				break;
			
					
		}
		
		}	
	}


