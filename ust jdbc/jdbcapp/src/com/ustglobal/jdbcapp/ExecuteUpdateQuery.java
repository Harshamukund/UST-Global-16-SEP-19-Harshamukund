package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con=DriverManager.getConnection(url);
			
			String sql=" update Employee_info set id=1 where id=8 ";
					
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
