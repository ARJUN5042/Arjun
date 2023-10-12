<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DataController" method="post">
<table>
<tr>
	<td>Item Name:</td>
	<td><input type="text" name="itemName"></td>
</tr>
<tr>
	<td>Item Quantity:</td>
	<td><input type="text" name="quantity"></td>
</tr>
<tr>
	<td>Item Total:</td>
	<td><input type="text" name="itemTotal"></td>
</tr>
<tr>
	<td><input type="submit" value="Add Item"></td>
</tr>
</table>
</form>
</body>
</html>