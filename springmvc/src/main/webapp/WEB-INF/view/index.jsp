<%
String s=(String) request.getAttribute("msg");

%>



<html>
<body>
<h2 style="color:red;">${msg}</h2>
<h3>${name}</h3>
<h1>${id}</h1>
<h2 style="color:green;"><%=s %></h2>
</body>
</html>
