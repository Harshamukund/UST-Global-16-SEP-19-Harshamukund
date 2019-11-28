package com.ustglobal.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

public class EmployeeDaoJdbcImpl implements EmployeeDAO {
	private static final String url="jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
	private static final String Driver_Class_Name="com.mysql.jdbc.Driver";
	private static final String select_sql="select * from employee_info where id=?";
	private static final String insert_sql="insert into employee_info values(?,?,?,?)";
	private static final String update_sql="update employee_info set password=? where id=?";
	@Override
	public EmployeeInfo searchEmployee(int id) {
		String sql="select_sql";
		try {
			Class.forName(Driver_Class_Name);
		
				try(Connection con=DriverManager.getConnection(url);
						PreparedStatement pstmt=con.prepareStatement(select_sql)){
					pstmt.setInt(1, id);
					try(ResultSet rs=pstmt.executeQuery()){
						if(rs.next()) {
							EmployeeInfo info=new EmployeeInfo();
							info.setId(rs.getInt("id"));
							info.setName(rs.getString("name"));
							info.setEmail(rs.getString("email"));
							info.setPassword(rs.getString("password"));
							return info;
						}
						else {
							return null;
						}
					}
					
					
				}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	
	}

	@Override
	public EmployeeInfo auth(int id, String password) {
		EmployeeInfo info=searchEmployee(id);
		if(info!=null) {
			String passw=info.getPassword();
			if(passw.equals(info.getPassword())) {
				return info;
			}
			else {
				return null;
			}
		}
		return null;
	}

	@Override
	public boolean changePassword(int id, String password) {
		String sql="update_sql";
		try {
			Class.forName(Driver_Class_Name);
		
				try(Connection con=DriverManager.getConnection(url);
						PreparedStatement pstmt=con.prepareStatement(update_sql)){
					pstmt.setString(1, password);
					pstmt.setInt(2, id);
					int count=pstmt.executeUpdate();
					boolean check=count>0? true : false;
					return check;
					
				}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}

	@Override
	public boolean registerEmployee(EmployeeInfo info) {
		String sql=" insert_sql";
	
	try {
		Class.forName(Driver_Class_Name);
		try(Connection con=DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement(insert_sql)){
			pstmt.setInt(1, info.getId());
			pstmt.setString(2, info.getName());
			pstmt.setString(3, info.getEmail());
			pstmt.setString(4, info.getPassword());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			else {
				return false;
			}

		}
	}
		catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}
	
	
		
	
	
	
	
	}


