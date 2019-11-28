package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.jdbc.Driver;

public class ExecuteDynamicSelect {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			/*step1- load the driver */
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		/*		step2- establish the connection*/
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		con=DriverManager.getConnection(url);
		/*step3-issue sql query*/
		
		String sql="select * from Employee_info where id=?";
		pstmt=con.prepareStatement(sql);
		int id=Integer.parseInt(args[0]);
		pstmt.setInt(1, id);
		rs=pstmt.executeQuery();
		
		/*step4-Read the result*/
		if(rs.next()) {
			int id1=rs.getInt("id");
			String name=rs.getString("name");
			int sal=rs.getInt("salary");
			String gender=rs.getString("gender");
			System.out.println("Id: "+id1);
			System.out.println("Name: "+name);
			System.out.println("Salary: "+sal);
			System.out.println("Gender: "+gender);
			System.out.println("==============");
		}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(con!=null) {
				con.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
			}
			catch(SQLException e) {
				e.printStackTrace();
				
			}
			
		}
		
		


	}

}
