<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>log out</title>
</head>
	<body>
	<form action="LoginCtl" method = "get">
	<%
	session.invalidate();
	%>
	<jsp:forward page ="LoginView.jsp"></jsp:forward>
	</form>
</body>
</html>