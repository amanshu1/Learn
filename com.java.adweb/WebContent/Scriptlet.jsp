<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SCRIPTLET AND EXPRESSION TAG</title>
</head>
<body>
<%
	for (int i=0;i<5;i++){
%>
<h1><%=i+1%>HELLO JSP</h1>
<%
}
%>
</body>
</html>