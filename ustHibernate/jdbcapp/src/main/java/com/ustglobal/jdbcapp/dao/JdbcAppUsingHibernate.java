package com.ustglobal.jdbcapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class JdbcAppUsingHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con=DriverManager.getConnection(url);
			
			String sql=" insert into Employee_info values(?,?,?,?) ";
			     pstmt=con.prepareStatement(sql);
			     int id=Integer.parseInt(args[0]);
			     pstmt.setInt(1, id);
			     
			     pstmt.setString(2, args[1]);
			     
			     int salary=Integer.parseInt(args[2]);
			     pstmt.setInt(3, salary);
			     
			     pstmt.setString(4, args[3]);
			     
			     
			     int count=pstmt.executeUpdate();
			     System.out.println(" rows updated " +count);
			     
			
			
			
			
			
			
			
		}
		catch(Exception e) {
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
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		



	}

}
