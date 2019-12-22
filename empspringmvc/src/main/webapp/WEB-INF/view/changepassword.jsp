<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
	<a href="./login">Logout</a>
	
	<h3>${msg}</h3>


<fieldset>
		<legend>Change password</legend>
		<form action="./changepassword" method="post">
			<table>
				<tr>
					<td>password</td>
					<td><input type="password" name="password"></td>

				</tr>
				<tr>
					<td>ChangePassword</td>
					<td><input type="password" name="cpassword"></td>

				</tr>
				<tr>
					
					<td><input type="submit" value="change"></td>
					<td><input type="reset" value="reset"></td>
				</tr>
			</table>
		</form>
	</fieldset>


</body>
</html>