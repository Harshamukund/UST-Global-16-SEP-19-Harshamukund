<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Register</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="retailername"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				
				<tr>
					<td><input type="reset" name="Reset"></td>
					<td><input type="submit" name="Register"></td>
				</tr>
			</table>
		</form>
		<a href="./login">Go back to login</a>
	</fieldset>
</body>
</html>