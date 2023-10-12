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
	<td>Firstname:</td>
	<td><input type="text" name="firstname"></td>
</tr>
<tr>
	<td>Lastname:</td>
	<td><input type="text" name="lastname"></td>
</tr>
<tr>
	<td>Email:</td>
	<td><input type="email" name="email"></td>
</tr>
<tr>
	<td>Subscription Name:</td>
	<td><input type="text" name="subscriptionName"></td>
</tr>
<tr>
	<td><input type="submit" value="Insert"></td>
</tr>
</table>
</form>
</body>
</html>