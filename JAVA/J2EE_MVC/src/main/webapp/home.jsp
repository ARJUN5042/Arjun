<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr>
	<th>Userid</th>
	<th>FirstName</th>
	<th>LastName</th>
	<th>Username</th>
	<th>Password</th>
	<th colspan="2">Action</th>
</tr>
<tr>
	<td>${hmodel.userid }</td>
	<td>${hmodel.firstname }</td>
	<td>${hmodel.lastname }</td>
	<td>${hmodel.username }</td>
	<td>${hmodel.password }</td>
	<td><a href="HomeController.do?action=edituser&userid=${hmodel.userid }">Edit</a></td>
	<td><a href="HomeController.do?action=deleteuser&userid=${hmodel.userid }">Delete</a></td>
</tr>
</table>
<br><br>

<form method="post" action="HomeController.do">
<table>
<tr>
	<td>First Name : </td>
	<td><input type="text" name="firstname" value="${homemodel.firstname }"/></td>
</tr>
<tr>
	<td>Last Name : </td>
	<td><input type="text" name="lastname" value="${homemodel.lastname }"/></td>
</tr>
<tr>
	<td>User Name : </td>
	<td><input type="text" name="username"  value="${homemodel.username }"/></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password"  value="${homemodel.password }"/><input type="hidden" name="userid" value="${homemodel.userid }"/></td>
</tr>
<tr>
	<td><input type="submit" value="Update"/></td>
</tr>
</table>
</form>
</body>
</html>