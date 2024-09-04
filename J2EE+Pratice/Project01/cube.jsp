<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cube</title>
</head>
<body>
	<%!
	int cube(int n)
	{
		return n*n*n;	
	}
	int square(int n)
	{
		return n*n;	
	}
	
	%>
	
	<h3>Square : <%=  square(Integer.parseInt(request.getParameter("num1"))) %> </h3>
	<h3>cube : <%=  cube(Integer.parseInt(request.getParameter("num1"))) %> </h3>
	
</body>
</html>