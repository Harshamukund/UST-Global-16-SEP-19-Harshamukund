package com.ustglobal.select;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=req.getServletContext();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sql="select * from Employee_info where id=?";
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			try(Connection con=DriverManager.getConnection(url);
					PreparedStatement pstmt=con.prepareStatement(sql)){
				pstmt.setInt(1, Integer.parseInt(req.getParameter("id")));
				ResultSet rs=pstmt.executeQuery();
				PrintWriter out=resp.getWriter();
				if(rs.next()) {
					out.println("<html><body><table>");
					out.println("<tr><th>id</th><th>name</th><th>salary</th><th>gender</th>");
					out.println("</tr>");
					out.println("<td>"+rs.getInt("id")+"</td>");
					out.println("<td>"+rs.getString("name")+"</td>");
					out.println("<td>"+rs.getString("salary")+"</td>");
					out.println("<td>"+rs.getString("gender")+"</td>");
					out.println("</table>");
					out.println("</body>");
					out.println("</html>");
					
					
				}
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
