<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>If else Condition</h4>
	<%
		int x = 25;
		if( x > 25){
			out.println("X is greater than 25");
		}else{
			out.println("X is not greater than 25");
		}
	%>
	
	<h4> for loop</h4>
	<%
		for ( int i = 0; i < 10; i++){
			out.print("<br/>");
			out.print(i);
		}
	%>
</body>
</html>