<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Single User Data</title>
</head>
<body>
<%
	User user=(User)request.getAttribute("user");
%>
<table>
	<tr>
		<th>Id:</th>
		<td><%=user.getId() %></td>
	</tr>
	<tr>
		<th>Name:</th>
		<td><%=user.getName() %></td>
	</tr>
	<tr>
		<th>Email:</th>
		<td><%=user.getEmail() %></td>
	</tr>
</table>
</body>
</html>