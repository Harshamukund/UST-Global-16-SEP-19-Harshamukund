package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteDynamicUpdateWithProperties {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement	pstmt=null;
		FileReader reader=null;
		try {
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			
			/*Driver driver=new Driver();
			DriverManager.registerDriver(driver);*/
			Class.forName(prop.getProperty("driver-name"));
			
			
			String url1=prop.getProperty("url");
			con=DriverManager.getConnection(url1,prop);
			
			String sql=prop.getProperty("update-query");
					
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
				if(reader!=null) {
					reader.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}





	}

}
