<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.time.LocalDate,java.time.LocalTime" %>
    

    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Date Time</title>
	</head>
<body>
	<h3>Date <%= LocalDate.now() %></h3><br>
	<h3>Time <%=LocalTime.now() %></h3>
</body>
</html>