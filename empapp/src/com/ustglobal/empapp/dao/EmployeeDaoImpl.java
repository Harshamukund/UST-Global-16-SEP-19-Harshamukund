package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dto.EmployeeBean;



public class EmployeeDaoImpl implements EmployeeDAO{
	
	public List<EmployeeBean> getAllEmployeeData(){
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from Employee_info";
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
						Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			ArrayList<EmployeeBean> result=new ArrayList<>();
			while(rs.next()) {
			EmployeeBean bean=new EmployeeBean();
			int id=rs.getInt("id");
			bean.setId(id);
			String name=rs.getString("name");
			bean.setName(name);
			int salary=rs.getInt("salary");
			bean.setSalary(salary);
			String gender=rs.getString("gender");
			bean.setGender(gender);
			
			result.add(bean);


				
			}
			return result;
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {try {
			if(con!=null) {
				con.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
			
		}
		
		}//end of getAllEmployeeData
	public EmployeeBean searchEmployeeData(int id) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from Employee_info where id=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection(url);
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}else {
				return null;
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		
		
	}//end of searchEmployeeData
	

		
	}//end of EmployeeDaoImpl


