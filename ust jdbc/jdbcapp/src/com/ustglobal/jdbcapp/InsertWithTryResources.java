package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Properties;

public class InsertWithTryResources {

	public static void main(String[] args) {
		try (FileReader reader=new FileReader("db.properties")){
			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-name"));
			String url1=prop.getProperty("url");
			String sql=prop.getProperty("insert-query");
			try(Connection con=DriverManager.getConnection(url1,prop);
					PreparedStatement pstmt=con.prepareStatement(sql);
					){
				int id=Integer.parseInt(args[0]);
			     pstmt.setInt(1, id);
			     pstmt.setString(2, args[1]);
			     
			     int salary=Integer.parseInt(args[2]);
			     pstmt.setInt(3, salary);
			     
			     pstmt.setString(4, args[3]);

				int count=pstmt.executeUpdate();
				System.out.println(count + " rows updated");				
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
