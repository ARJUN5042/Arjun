<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<h1>User Login</h1>
<form method="post" action="login">
	<table>
		<tr>
			<td><label for="email">Email : </label></td>
			<td><input type="text" id="email" name="email" placeholder="Enter Email Here" required></td>
		</tr>
		<tr>
			<td><label for="password">Password: </label></td>
			<td><input type="password" id="password" name="password" placeholder="Enter Password Here" required></td>
		</tr>
		<tr>
			<td><input type="submit" value="Login"></td>
		</tr>
	</table>
</form>
</body>
</html>