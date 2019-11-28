package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDynamicDelete {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			/*Driver driver=new Driver();
			DriverManager.registerDriver(driver);*/
			Class.forName("com.mysql.jdbc.Driver");
			
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con=DriverManager.getConnection(url);
			
			String sql=" delete from Employee_info where id=? ";
					
			     pstmt=con.prepareStatement(sql);
			    int id= Integer.parseInt(args[0]);
			    pstmt.setInt(1, id);
			     
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
			catch(SQLException e) {
				e.printStackTrace();
			}
		}



	}

}
