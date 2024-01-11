<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Student s = (Student) session.getAttribute("student");
	%>
	<h1>Edit Form</h1>
	<form method="post" action="/SpringLoginPractice/update">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="<%=s.getName()%>"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" value="<%=s.getMobile()%>"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%=s.getEmail()%>"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" value="<%=s.getPassword()%>">
				<input type="hidden" name="id" value="<%=s.getId()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>