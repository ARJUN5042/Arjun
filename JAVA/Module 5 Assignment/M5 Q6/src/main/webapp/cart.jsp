<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg }
${msg1 }
<form action="DataController" method="post">
<table>
<tr>
	<td>Cart name:</td>
	<td><input type="text" name="name"></td>
</tr>
<tr>
	<td>Item Total:</td>
	<td><input type="text" name="total"></td>
</tr>
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
	<td><input type="submit" value="Add Cart"></td>
</tr>
</table>
</form>
</body>
</html>