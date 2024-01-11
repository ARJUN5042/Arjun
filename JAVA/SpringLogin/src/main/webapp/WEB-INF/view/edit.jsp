<%@page import="com.model.UserModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Form</h1>
<% UserModel u = (UserModel) session.getAttribute("u"); %>
<form method="post" action="/SpringLogin/update">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="<%=u.getName() %>"></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email" value="<%=u.getEmail() %>"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value="<%=u.getPassword() %>">
				<input type="hidden" name="id" value="<%=u.getId() %>"></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>