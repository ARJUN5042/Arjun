<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Home Page</h1>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>${m.id }</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${m.name }</td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td>${m.mobile }</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${m.email }</td>
		</tr>
		<tr>
			<td>Password</td>
			<td>${m.password }</td>
		</tr>
	</table>
	<br>
	<form action="HomeController" method="post">
	<input type="hidden" name="id" value="${m.id }">
	<input type="submit" name="action" value="Edit">
	<input type="submit" name="action" value="Delete">
	</form>
</body>
</html>