<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Address Details</h1>
<form action="DataController" method="post">
<table>
<tr>
	<td>Street: </td>
	<td><input type="text" name="street"></td>
</tr>
<tr>
	<td>City: </td>
	<td><input type="text" name="city"></td>
</tr>
<tr>
	<td>State: </td>
	<td><input type="text" name="state"></td>
</tr>
<tr>
	<td>ZipCode: </td>
	<td><input type="text" name="zipcode"></td>
</tr>
<tr>
	<td><input type="submit" value="Insert"></td>
</tr>
</table>
</form>
</body>
</html>