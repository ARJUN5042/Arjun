<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css" type="text/css">
<title>User Registration</title>
</head>
<body>
<h1>User Registration</h1>
<form method="post" action="register">
	<table>
		<tr>
			<td>Firstname : </td>
			<td><input type="text" id="firstName" name="firstname" placeholder="Enter Name Here" required></td>
		</tr>
		<tr>
			<td>Lastname : </td>
			<td><input type="text" id="lastname" name="lasName" placeholder="Enter Surname Here" required></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type="text" id="email" name="email" placeholder="Enter Email Here" required></td>
		</tr>
		<tr>
			<td>Mobile : </td>
			<td><input type="text" id="mobile" name="mobile" placeholder="Enter Mobile" required></td>
		</tr>
		<tr>
			<td>Password: </td>
			<td><input type="password" id="password" name="password" placeholder="Enter Password Here" required></td>
		</tr>
		<tr>
			<td><input type="submit" value="Register"></td>
		</tr>
	</table>
</form>
<script src="script.js"></script>
</body>
</html>