package com.testyantra.qspiders.phone.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.testyantra.qspiders.phone.dto.PhoneBeanClass;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PhoneDAOImp implements PhoneDAO {
	

	@Override
	public void addContact() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Name");
		String userName = sc.nextLine();
		System.out.println("enter Number");
		int userNumber = sc.nextInt();
		System.out.println("enter Groups");
		String userGroups = sc.next();
		Connection conn = null;
		PreparedStatement pstmt = null;
		
				
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql  = "insert into contactFile values(userName,userNumber,userGroups)";
		
		try {
			
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, userName);
//			pstmt.setInt(2, userNumber);
//			pstmt.setString(3, userGroups);
			
			int count = pstmt.executeUpdate();
			System.out.println("No of contacts inserted "+count);
			
			} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			
				try {
					if(conn!=null)
					conn.close();
					if(pstmt!=null)
						pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		}
		
		
	}

	@Override
	public void deleteContact() 
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name ");
		String userNumber = sc.nextLine();
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql  = "delete from contactFile where name ='"+userNumber+"'";
		
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, userNumber);
			int count = pstmt.executeUpdate();
			System.out.println("No of number deleted from contact list "+count);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
				try {
					if(conn!=null)
					conn.close();
					if(pstmt!=null)
						pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
	}

	@Override
	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name whose number needs to be changed ");
		String userName = sc.nextLine();
		System.out.println("Enter updated number");
		int userNumber = sc.nextInt();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
				
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql  = "update contactFile set number = "+userNumber+" where name = '"+userName+"'";
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, userNumber);
//			pstmt.setString(2, userName);
			int count = pstmt.executeUpdate();
			System.out.println("No of number updated from contact list "+count);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				if(conn!=null)
				conn.close();
				if(pstmt!=null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
		
	}

	@Override
	public PhoneBeanClass searchContact() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a name to search");
		String name = sc.nextLine();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<PhoneBeanClass> result = new ArrayList<PhoneBeanClass>();
			
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql  = "select * from contactFile where name ='"+name+"'";
		PhoneBeanClass bean = new PhoneBeanClass();	
		
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroups(rs.getString("groups"));
				return bean;
			}
		
			else
			{
				return null;
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
			
		}finally
		{
			try {
				if(conn!=null)
				conn.close();
				if(pstmt!=null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		}
		
	}

	@Override
	public ArrayList<PhoneBeanClass> displayContact() {

		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<PhoneBeanClass> result = new ArrayList<PhoneBeanClass>();
			
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql  = "select * from contactFile";
		
		
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				PhoneBeanClass bean = new PhoneBeanClass();	
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroups(rs.getString("groups"));
				result.add(bean);
				
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				if(conn!=null)
				conn.close();
				if(pstmt!=null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		}
		
		return result;
	}
	
	
	

}
