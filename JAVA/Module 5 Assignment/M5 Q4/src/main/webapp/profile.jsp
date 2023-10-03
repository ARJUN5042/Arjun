<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<%
	User user=(User)request.getAttribute("user");
%>
<h1>Profile</h1>
<table border="1">
	<tr>
		<th>User Id: </th>
		<th>FirstName: </th>
		<th>LastName: </th>
		<th>Email: </th>
		<th>Mobile: </th>
		<th>Password: </th>
		<th>Gender: </th>
	</tr>
	<tr>
		<td><%=user.getId() %></td>
		<td><%=user.getFirstname() %></td>
		<td><%=user.getLastname() %></td>
		<td><%=user.getEmail() %></td>
		<td><%=user.getMobile() %></td>
		<td><%=user.getPassword() %></td>
		<td><%=user.getGender() %></td>
	</tr>
</table>
</body>
</html>