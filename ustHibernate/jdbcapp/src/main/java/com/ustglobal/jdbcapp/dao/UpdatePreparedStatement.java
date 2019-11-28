package com.ustglobal.jdbcapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class UpdatePreparedStatement {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement	pstmt=null;
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con=DriverManager.getConnection(url);
			
			String sql=" update Employee_info set name=?,salary=?,gender=? where id=? ";
					
			     pstmt=con.prepareStatement(sql);
			     int id=Integer.parseInt(args[0]);
			     pstmt.setInt(4, id);/*4 because id question mark is in 4th place*/
			     
			     pstmt.setString(1, args[1]);
			     
			     int salary=Integer.parseInt(args[2]);
			     pstmt.setInt(2, salary);
			     
			     pstmt.setString(3, args[3]);


			     
			     
			     
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
