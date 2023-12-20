<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updata Data</title>
</head>
<body>
<h2>Update</h2>
<form action="updateForm" method="post">
<table>
<tr>
<td>Id:</td>
<td><input type="text" name="id"></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" name="address"></td>
</tr>
<tr>
<td><button type="submit">Update</button></td>
</tr>
</table>
</form>
</body>
</html>