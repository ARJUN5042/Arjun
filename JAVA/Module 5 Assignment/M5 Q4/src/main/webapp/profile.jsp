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
	User user = (User) request.getAttribute("user");
	%>
	<h1>Profile</h1>
	<table border="1">
		<tr>
			<th>User Id:</th>
			<td colspan="2"><%=user.getId()%></td>
		</tr>
		<tr>
			<th>FirstName:</th>
			<td colspan="2"><%=user.getFirstname()%></td>
		</tr>
		<tr>
			<th>LastName:</th>
			<td colspan="2"><%=user.getLastname()%></td>
		</tr>
		<tr>
			<th>Email:</th>
			<td colspan="2"><%=user.getEmail()%></td>
		</tr>
		<tr>
			<th>Mobile:</th>
			<td colspan="2"><%=user.getMobile()%></td>
		</tr>
		<tr>
			<th>Password:</th>
			<td colspan="2"><%=user.getPassword()%></td>
		</tr>
		<tr>
			<th>Gender:</th>
			<td colspan="2"><%=user.getGender()%></td>
		</tr>
		<tr>
			<th>Profile Photo:</th>
			<td colspan="2"><img alt="image" width="300px" height="300px" src="images\<%=user.getImage() %>"></td>
		</tr>
		<tr>
			<th>Action</th>
			<td><a
				href="HomeController?action=edituser&id=<%=user.getId()%>">Edit</a></td>
			<td><a
				href="HomeController?action=deleteuser&id=<%=user.getId()%>">Delete</a></td>
		</tr>
	</table>
</body>
</html>