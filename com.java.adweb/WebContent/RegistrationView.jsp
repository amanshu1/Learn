<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration page</title>
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
		<% String a =(String) request.getAttribute("sure");
		if(a!=null){	
		%>
		<font color="green"><%=a%></font>
		<%} %>
		<form action="RegistrationCtl" method="post">
			<table>
				<tr>
					<td>Enter username :<input type="text" name="username"
						placeholder="USERNAME">
					<%String empty=(String)request.getAttribute("empty");
					if(empty!=null){
					%>
					<font color="red"><%=empty %></font>
					<%} %>	
					</td>
				</tr>

				<tr>
					<td>Enter first name :<input type="text" name="fname"
						placeholder="FIRST NAME">
					<%String empty1=(String)request.getAttribute("empty1");
					if(empty1!=null){
					%>
					<font color="red"><%=empty1 %></font>
					<%} %></td>
				</tr>

				<tr>
					<td>Enter last name :<input type="text" name="lname"
						placeholder="LAST NAME">
					<%String empty2=(String)request.getAttribute("empty2");
					if(empty2!=null){
					%>
					<font color="red"><%=empty2 %></font>
					<%} %>
					</td>
				</tr>

				<tr>
					<td>Enter Email :<input type="Email" name="Email"
						placeholder="EMAIL ADDRESS">
					<%String empty3=(String)request.getAttribute("empty3");
					if(empty3!=null){
					%>
					<font color="red"><%=empty3 %></font>
					<%} %>
					</td>
						
				</tr>

				<tr>
					<td>Enter Password :<input type="Password" name="pass"
						placeholder="NEW PASSWORD">
					<%String empty4=(String)request.getAttribute("empty4");
					if(empty4!=null){
					%>
					<font color="red"><%=empty4 %></font>
					<%} %>	
					</td>
				</tr>

				<tr>
					<td>Enter Date Of Birth :<input type="Date" name="Date">
					<%String empty5=(String)request.getAttribute("empty5");
					if(empty5!=null){
					%>
					<font color="red"><%=empty5 %></font>
					<%} %>
					</td>
				</tr>

				<tr>
					<td>Gender :<input type="radio" name="Gender" value="Male">Male
						<input type="radio" name="Gender" value="Female">Female <input
						type="radio" name="Gender" value="Other">Other
						<%String empty6=(String)request.getAttribute("empty6");
					if(empty6!=null){
					%>
					<font color="red"><%=empty6 %></font>
					<%} %>
					</td>
				</tr>

				<tr>
					<td><center>
							<input type="submit" value="Sign In">
						</center></td>
				</tr>
			</table>
			<hr>
		<%@ include file="Footer.jsp" %>
		</form>
	</center>

</body>
</html>