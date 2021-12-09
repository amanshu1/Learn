<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<form action="ForgotPasswordCtl" method="post">
			<table>
				<tr>
					<td>Enter email address :<input type="text" name="email"
						placeholder="EMAIL"></td>
				</tr>
				<tr>
					<td><center>
							<input type="submit" value="view password">
						</center></td>
				</tr>
				<tr>
					<td>
						<%
							String password = (String) request.getAttribute("pass");
							if (password != null) {
						%>
						<center>
							<font color="red"><%=password%></font>
						</center> <%
 						}
						 %>
					</td>
				</tr>

			</table>
		</form>
		<hr>
		<%@ include file="Footer.jsp" %>
	</center>
</body>
</html>