package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginpageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String id="";
		
		Cookie[] cookies=req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("alwaysremember")) {
				id =cookie.getValue();
			}
			}
		}
		out.println("<html>");
		out.println("<form action='./login' method='post'>");
		out.println("<center><label for='login'><h1>Login Here</h1></label><center></center>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<span><label for='id'><h3>Id:</h3></label>");
		out.println("<input type='text' name='id' value='"+id+"'></span><br>");
		out.println("<p><div><label for='password'><h3>Password:</h3></label>");
		out.println("<input type='password' name='password'></div></p><br>");
		out.println("<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>");
		out.println("<input type='checkbox' name='rememberme' value='checked'>Remember Me<br>");
		out.println("<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>");
		out.println("<input type='submit' name='submit' value='login'><br>");
		out.println("<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>");
		out.println("<a href='register.html'>Register</a></center>");
		out.println("</html>");
		
	}

}
