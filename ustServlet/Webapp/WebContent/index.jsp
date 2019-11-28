<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Date"%>
<%@include file="index.jsp" %>

<%! 
	public void jspInit(){
	System.out.println("this is init phase");
}
%>
<%! 
	public void jspDestroy(){
	System.out.println("this is destroy phase");
}
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% 
		Date date=new Date();
%>
<%! public int i=10;
	public void m(){
		System.out.println(i);
	}
%>
<body>
Object obj=new Object();
<h1 style="color:green">Date and Time is <%= date %></h1>

</body>
</html>