<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>Registration Form</h1>
<form action="LoginController" method="post">
	<table>
		<tr>
			<td><label for="email">Email: </label></td>
			<td><input type="email" id="email" name="email" required></td>
		</tr>		
		<tr>
			<td><label for="password">Password: </label></td>
			<td><input type="password" id="password" name="password" required></td>
		</tr>
		<tr>
			<td><input type="submit" value="Login"></td>
			<td><a href="forgotpassword.jsp">Forgot Password</a></td>
		</tr>
	</table>
</form>
</body>
</html>