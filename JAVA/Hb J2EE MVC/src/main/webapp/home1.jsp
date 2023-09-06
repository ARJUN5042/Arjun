<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="HomeController">
<table>
<tr>
	<td>First Name : </td>
	<td><input type="text" name="firstname" value="${hmodel.firstname }"/></td>
</tr>
<tr>
	<td>Last Name : </td>
	<td><input type="text" name="lastname" value="${hmodel.lastname }"/></td>
</tr>
<tr>
	<td>User Name : </td>
	<td><input type="text" name="username"  value="${hmodel.username }"/></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password" value="${hmodel.password }"/>
	<input type="hidden" name="uid" value="${hmodel.uid }"/>
	</td>
</tr>
<tr>
	<td><input type="submit" value="Update"/></td>
</tr>
</table>
</form>
</body>
</html>