package com.ustglobal.jdbcapp;

import java.sql.SQLException;

import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

import java.sql.Statement;

import java.sql.Connection;

public class ExecuteInsertQuery {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con=DriverManager.getConnection(url);
			
			String sql=" insert into Employee_info "
					+ " values(7,'rathan',15000,'m') ";
			     stmt=con.createStatement();
			     
			     int count=stmt.executeUpdate(sql);
			     System.out.println(" rows updated " +count);
			     
			
			
			
			
			
			
			
		}
		catch(SQLException e) {
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
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
