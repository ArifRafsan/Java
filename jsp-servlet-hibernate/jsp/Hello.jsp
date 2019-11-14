<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<!-- JSP Scripting element -->
	<%= 2 * 5 %> <!-- expression -->
	<% out.println("Hello World"); %> <!-- scriptlets-->
	<%! public int count = 0; %> <!-- declarations -->
	<%@ page %> <!-- directive -->
	<%--comment --%> 
	
	
	<br/>
	<%= 25*4 %>
</body>
</html>