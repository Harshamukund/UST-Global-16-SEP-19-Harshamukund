package com.ustglobal.Webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//String search=req.getParameter("search");
		//resp.sendRedirect("https://www.google.com/search?q="+search);*/
		String select=req.getParameter("search");
		if(select.equals("google")) {
		resp.sendRedirect("https://www.google.com/search?q="+select);
	}
		else if(select.equals("bing")) {
			resp.sendRedirect("https://www.bing.com/search?q="+select);
		}
		else if(select.equals("yahoo")){
			resp.sendRedirect("https://in.search.yahoo.com/search?p="+select);
			
		}
		}

}
