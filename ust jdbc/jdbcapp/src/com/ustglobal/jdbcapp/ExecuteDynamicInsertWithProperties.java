package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteDynamicInsertWithProperties {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;
		try {
			reader=new FileReader("db.properties");
			
			/*Driver driver=new Driver();
			DriverManager.registerDriver(driver);*/
			Properties prop=new Properties();
			prop.load(reader);
			String driver1=prop.getProperty("driver-name");
			Class.forName(driver1);
			
			
			String url=prop.getProperty("url");
			con=DriverManager.getConnection(url,prop);
			
			String sql=prop.getProperty("insert-query");
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
