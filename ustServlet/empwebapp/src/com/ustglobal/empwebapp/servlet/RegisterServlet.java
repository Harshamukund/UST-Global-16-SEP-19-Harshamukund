package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		EmployeeInfo info=new EmployeeInfo();
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);
		
		EmployeeDAO dao=EmployeeDaoManager.getEmployeeDAO();
		boolean check=dao.registerEmployee(info);
		PrintWriter out=resp.getWriter();
		String msg="";
		if(check) {
			msg="Registeration completed";			
		}
		else {
			msg="id cannot be repeated";
						
		}
		req.setAttribute("msg", msg);
		RequestDispatcher dispatcher=req.getRequestDispatcher("./login.jsp");
		dispatcher.include(req, resp);


	}

}
