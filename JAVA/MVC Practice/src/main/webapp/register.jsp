<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
${msg }
</head>
<body>
<h2>Registration Page</h2>
<form method="post" action="RegisterController">
<table>
<tr>
	<td><label>Firstname : </label></td>
	<td><input type="text" name="firstname"></td>
</tr>
<tr>
	<td><label>Lastname : </label></td>
	<td><input type="text" name="lastname"></td>
</tr>
<tr>
	<td><label>Username : </label></td>
	<td><input typr="text" name="username"></td>
</tr>
<tr>
	<td><label>Password : </label></td>
	<td><input type="password" name="password"></td>
</tr>
<tr>
	<td><button name="action" value="Register">Register</button></td>
</tr>
</table>
</form>
</body>
</html>