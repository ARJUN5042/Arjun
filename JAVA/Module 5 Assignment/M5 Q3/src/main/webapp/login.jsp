<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login</h1>
<form action="LoginController" method="post">
	<table>
		<tr>
			<td>Email: </td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td>Password: </td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Login"></td>
		</tr>
	</table>
</form>
</body>
</html>