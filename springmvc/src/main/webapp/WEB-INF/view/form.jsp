<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./form" method="post">
<table>
<tr>
<th>Id</th>
<td><input type="number" name="id"></td>
</tr>
<tr>
<th>Name</th>
<td><input type="text" name="name"></td>
</tr>

<tr>
<th>Password</th>
<td><input type="password" name="password"></td>
</tr>
<tr>
<th>Gender</th>
<td><input type="text" name="gender"></td>



</tr>
<tr>
<th>DOJ</th>
<td><input type="date" name="doj"></td>
</tr>
<tr>
<td><input type="reset" value="reset"></td>
<td><input type="submit" value="submit"></td>
</tr>

</table>

</form>

</body>
</html>