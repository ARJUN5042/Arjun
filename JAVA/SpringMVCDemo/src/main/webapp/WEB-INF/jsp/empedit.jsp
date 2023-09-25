<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/SpringMVCDemo/editsave">
<table>
<tr>
	<td>Name : </td>
	<td><input type="text" name="name" value="${command.name }"></td>
</tr>
<tr>
	<td>Salary : </td>
	<td><input type="text" name="salary" value="${command.salary }"></td>
</tr>
<tr>
	<td>Desg : </td>
	<td><input type="text" name="desg" value="${command.desg }">
	<input type="hidden" name="id" value="${command.id }">
	</td>
</tr>
<tr>
	<td><input type="submit" name="Update"></td>
</tr>
</table>
</form>
</body>
</html>