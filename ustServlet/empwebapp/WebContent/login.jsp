<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>t
<jsp:useBean id="msg" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="request"></jsp:useBean>
<% 
String id="";
		
		Cookie[] cookies=request.getCookies();
		if(cookies!=null) {
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("alwaysremember")) {
				id =cookie.getValue();
			}
			}
		}
		%>
<body>
<h4><%= msg %></h4>
<form action='./login' method='post'>
<center><label for='login'><h1>Login Here</h1></label><center></center>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<span><label for='id'><h3>Id:</h3></label>
<input type='text' name='id'></span><br>
<p><div><label for='password'><h3>Password:</h3></label>
<input type='password' name='password'></div></p><br>
<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
<input type='checkbox' name='rememberme' value='checked'>Remember Me<br>
<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
<input type='submit' name='submit' value='login'><br>
<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
<a href='register.html'>Register</a></center>


</form>
		
</body>
</html>