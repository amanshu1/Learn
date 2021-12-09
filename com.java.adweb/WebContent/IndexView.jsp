<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
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
	<form action="IndexCtl" method="post">
		<%@ include file="Header.jsp"%>
		<hr>
			<h2>hello People</h2>
			<h1><i>Welcome to Rays Family &#128151</i></h1>
			<table>
				<tr>
					<td><b><p style="color:purple;font-size:25px">Already have an account?<a
						href=http://localhost:8080/com.java.adweb/LoginView.jsp>log in</a></p></b></td>
				</tr>
				<tr>
					<td><b><p style="font-size:25px">Don't have an account?<a
						href="http://localhost:8080/com.java.adweb/RegistrationView.jsp">sign
							up</a></p></b></td>
				</tr>
			</table>
		<hr>
		<%@ include file="Footer.jsp" %>
		</form>
		</center>
</body>
</html>