package com.ustglobal.jdbcapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Selectjdbc {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			/*step1- load the driver */
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		/*		step2- establish the connection*/
		String url="jdbc:mysql://localhost:3306/ust_ty_db";
		con=DriverManager.getConnection(url,"root","root");
		/*step3-issue sql query*/
		stmt=con.createStatement();
		String sql="select * from Employee_info";
		rs=stmt.executeQuery(sql);
		/*step4-Read the result*/
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int sal=rs.getInt("salary");
			String gender=rs.getString("gender");
			System.out.println("Id: "+id);
			System.out.println("Name: "+name);
			System.out.println("Salary: "+sal);
			System.out.println("Gender: "+gender);
			System.out.println("==============");
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(con!=null) {
				con.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
		}
		
		

		

	}

}
