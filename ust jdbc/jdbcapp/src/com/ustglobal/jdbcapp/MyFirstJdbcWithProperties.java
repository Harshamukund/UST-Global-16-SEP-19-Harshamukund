package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJdbcWithProperties {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		FileReader reader=null;
		try {
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			/*step1- load the driver */
			/*Driver driver=new Driver();
			DriverManager.registerDriver(driver);*/
			String driver=prop.getProperty("driver-name");
			Class.forName(driver);
			/*		step2- establish the connection*/
			String url=prop.getProperty("url");
			con=DriverManager.getConnection(url,prop);
			/*step3-issue sql query*/
			stmt=con.createStatement();
			String sql=prop.getProperty("select-query");
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
				if(reader!=null) {
					reader.close();
				}

			}
			catch(Exception e) {
				e.printStackTrace();

			}

		}



	}/*end of main*/


}
