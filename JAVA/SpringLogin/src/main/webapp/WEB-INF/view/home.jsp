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
<% UserModel u=(UserModel)session.getAttribute("u");  %>
	<h1>Home Page</h1>
	<table border="1">
		<tr>
			<td>Name</td>
			<td><%=u.getName() %></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><%=u.getEmail() %></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><%=u.getPassword() %></td>
		</tr>
		<tr>
			<td><a href="edit/<%=u.getId() %>">Edit</a></td>
			<td><a href="delete/<%=u.getId() %>">Delete</a></td>
		</tr>
	</table>
</body>
</html>