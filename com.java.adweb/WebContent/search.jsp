<%@page import="com.java.adweb.app.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% Student a =(Student) request.getAttribute("Search");
		if(a!=null){	
		%>
		<%=a.getFirstName() %>
		<%=a.getLastName() %>
		<%= a.getRollNo() %>
		<%} %>

</body>
</html>