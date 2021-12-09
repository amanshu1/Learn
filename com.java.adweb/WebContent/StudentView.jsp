<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student</title>
<style type="text/css">
body {
	background-image: url("bg2.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}
</style>
</head>
<body>
<form action="StudentCtl" method="get">
<center>
	<h1>Student section</h1>
<table>
	<tr><td>Id<input type="text" name="Id"></td></tr>
	<tr><td>RollNo<input type="text" name="RollNo"></td></tr>
	<tr><td>FirstName<input type="text" name="FirstName"></td></tr>
	<tr><td>LastName<input type="text" name="LastName"></td></tr>
	<tr><td>Session<input type="text" name="Session"></td></tr>
	<tr><td><input type="submit" name="operation" value="add">
			<input type="submit" name="operation" value="delete">
			<input type="submit" name="operation" value="update"></td></tr>
</table>
</center>
</form>
</body>
</html>