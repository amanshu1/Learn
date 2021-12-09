<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
body {
	background-image: url("bg3.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}
</style>
</head>
<body>
	<center>
		<%@ include file="Header.jsp"%>
		<hr>
		<h1>RAYS TECHNOLOGIES</h1>
		<hr>
		<% String a =(String) request.getAttribute("error");
		if(a!=null){	
		%>
		<font color="red"><%=a%></font>
		<%} %>
		<form action="LoginCtl" method="post">
			<table>
				<tr>
					<td>Enter Email :<input type="email" name="email"
						placeholder="email">
					<%String empty=(String)request.getAttribute("empty");
					if(empty!=null){
					%>
					<font color="red"><%=empty %></font>
					<%} %>	
					</td>
				</tr>
				<tr>
					<td>Enter Password :<input type="Password" name="Pass"
						placeholder="NEW PASSWORD">
					<%String empty1=(String)request.getAttribute("empty1");
					if(empty1!=null){
					%>
					<font color="red"><%=empty1 %></font>
					<%} %>	
					</td>
				</tr>
				<tr>
					<td><center>
							<input type="submit" value="log In">
						</center></td>
				</tr>
				<tr>
					<td>Don't have an account?<a
						href="http://localhost:8080/com.java.adweb/RegistrationView.jsp">sign
							up</a></td>
				</tr>
				<tr>
					<td><a
						href="http://localhost:8080/com.java.adweb/ForgotPasswordView.jsp">forgot
							password</a></td>
				</tr>
			</table>
		</form>
		<hr>
		<%@ include file="Footer.jsp" %>
	</center>
</body>
</html>