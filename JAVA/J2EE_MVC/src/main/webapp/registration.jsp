<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg }
<form method="post" action="RegistrationController">
<table>
<tr>
	<td>First Name : </td>
	<td><input type="text" name="firstname"/></td>
</tr>
<tr>
	<td>Last Name : </td>
	<td><input type="text" name="lastname"/></td>
</tr>
<tr>
	<td>User Name : </td>
	<td><input type="text" name="username"/></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password"/></td>
</tr>
<tr>
	<td><input type="submit" value="Register"/></td>
</tr>
</table>
</form>
</body>
</html>