<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
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
	<form action="WelcomeCtl" method="post">
		<center>
			<%@ include file="Header.jsp"%>
			<table>
			<hr>
			<tr>
				<td>
					<h1>
						<b><font color="voilet">welcome to our WebApplication</font></b>
					</h1>
				</td>
			</tr>
			<tr>
				<td>
						<%String fname = (String) request.getAttribute("name");
							if (fname != null) {
						%><h3>&#128516 Hello<i><%=fname%></i>
					</h3> 
						<%
 						}
 						%>
				</td>
				<td><% String fname1 =(String) session.getAttribute("user");
	if(fname1!=null){	
	%>
	<a href = "Logout.jsp">logout</a>
	<%} %></td>
			</tr>
			</table>
			<hr>
			<%@ include file="Footer.jsp"%>
		</center>
	</form>
</body>
</html>