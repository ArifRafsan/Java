<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Import Anything in JSP</title>
</head>
<body>
	<!--One way to import package -->
	<% out.print( new java.util.Date()); %>
	
	
	<br/>
	<!--Another way to import package -->
	<%@ page import="java.util.Date" %>
	<%= new Date() %>
	
	<!-- import package class -->
	<!-- 
		import="packageName.className"
		
		out.print(new ClassName().methodName())
	 -->
</body>
</html>