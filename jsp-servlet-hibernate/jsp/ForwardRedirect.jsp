<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forward & Redirect</title>
</head>
<body>
	
	<%
		//request.getRequestDispatcher("Forward.jsp").forward(request, response);
		response.sendRedirect("Redirect.jsp");
	%>
	
</body>
</html>