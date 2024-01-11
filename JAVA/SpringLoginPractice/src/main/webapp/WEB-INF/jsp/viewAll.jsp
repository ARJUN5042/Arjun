<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>View All</h1>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Mobile</td>
			<td>Email</td>
			<td>Password</td>
			<td>Action</td>
		</tr>
		<%
		List<Student> list = (List<Student>) request.getAttribute("lists");
		for (Student lists : list) {
		%>
		<tr>
			<td><%=lists.getId()%></td>
			<td><%=lists.getName()%></td>
			<td><%=lists.getMobile()%></td>
			<td><%=lists.getEmail()%></td>
			<td><%=lists.getPassword()%></td>
			<td><a href="deleteFromviewAll/<%=lists.getId()%>">Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
	
	
	<br><br>
	<a href="logout">Return to Index Page</a>
</body>
</html>