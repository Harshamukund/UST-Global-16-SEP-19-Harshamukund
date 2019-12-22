<%@page import="com.ustglobal.bean.ProductBean"%>
<%@page import="com.ustglobal.bean.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    RetailerBean bean=(RetailerBean)session.getAttribute("bean");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./changepassword">change password</a>
<a href="./orderlist">Order list</a>
<a href="./delete">Delete profile</a>
<a href="./logout">logout</a>
<h2>Welcome  <%=bean.getRetailername() %></h2>
<fieldset>
<legend>Search product</legend>
<form action="./search">
<table>
<tr>
<td>Id</td>
<td><input type="number" name="id"></td>
<td><input type="submit" name="search"></td>

</tr>




</table>


</form>

</fieldset>
<%
ProductBean rb=(ProductBean)request.getAttribute("bean") ;%>

<%
if(rb!=null){
	%>
	<table>
	<tr>
		<th>RetailerName</th>
		<th>RetailerEmail</th>
					</tr>
	<tr>
		<td><%=rb.getOrderid()%></td>
		<td><%=rb.getProductname() %></td>
			
	</tr>
	
	
	</table>
	<%
}
	%>
	<h3>${msg}</h3>

</body>
</html>