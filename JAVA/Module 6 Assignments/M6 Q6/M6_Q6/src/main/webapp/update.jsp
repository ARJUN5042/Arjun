<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data</title>
</head>
<body>
<%
	User user=(User)request.getAttribute("user");
%>
<form method="post" action="ActionController">
	<table>
		<tr>
			<td>Name: </td>
			<td><input type="text" name="name" value="<%=user.getName() %>">
			<input type="text" name="id" value="<%=user.getId() %>"></td>
		</tr>
		<tr>
			<td>Email: </td>
			<td><input type="email" name="email" value="<%=user.getEmail() %>">
			<input type="text" name="id" value="<%=user.getId()%>"></td>
		</tr>
		<tr>
			<td><input type="submit" name="action" value="Update"></td>
		</tr>
	</table>
</form>
</body>
</html>