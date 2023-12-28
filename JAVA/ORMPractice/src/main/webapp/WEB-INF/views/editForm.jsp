<%@page import="com.model.Emp"%>
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
Emp emp=(Emp)request.getAttribute("emp");
%>
	<h1>Edit Emp Form</h1>
	<form method="post" action="/ORMPractice/update">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="<%=emp.getName() %>"></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="salary" value="<%=emp.getSalary() %>"></td>
			</tr>
			<tr>
				<td>Desg:</td>
				<td><input type="text" name="desg" value="<%=emp.getDesg() %>">
				<input type="hidden" name="id" value="<%=emp.getId() %>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>