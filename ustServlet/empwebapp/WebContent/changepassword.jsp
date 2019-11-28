<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="request"></jsp:useBean>
<body>
<form action="./changepassword" method="post">
<div style="color:blue;background-color: yellow;margin-top: 1cm"><center>Register Here</center></div>
<a href="./home" style="float:left">home</a>
<a href="" style="float:right">Logout</a>
<h4><%= msg %></h4>

			<center><div><label for="password">NewPassword:</label>
			<input type="password" name="password" ></div></center><br>
			<div>&nbsp;&nbsp;</div>
			<center><div><label for="confirmpassword">confirmpassword:</label>
			<input type="password" name="confirmpassword">
			</div>
			</center>
			<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
			<center>	<input type="reset" name="reset" value="reset"></center>
			<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
		<center>	<input type="submit" name="changepassword" value="changepassword"></center>



</form>


</body>
</html>