package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithCsvFile {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="insert into Employee_info values(?,?,?,?)";
		try(FileReader in=new FileReader("csv.txt");
				BufferedReader reader=new BufferedReader(in);
				Connection con=DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement(sql)){
		
			while(reader.ready()) {
				String line=reader.readLine();
				String[] datas=line.split(",");
	           pstmt.setInt(1, Integer.parseInt(datas[0]));
			   pstmt.setString(2, datas[1]);
				pstmt.setInt(3, Integer.parseInt(datas[2]));
				pstmt.setString(4, datas[3]);
				 pstmt.addBatch();
				
			}
			int[] counts=pstmt.executeBatch();
			System.out.println(counts.length + " Rows inserted");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

}
