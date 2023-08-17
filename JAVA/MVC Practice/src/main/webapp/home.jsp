<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Record of User</h2>

<table border="1">
<tr>
	<th>User Id</th>
	<th>Firstname</th>
	<th>Lastname</th>
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
	<td><a href="HomeController?action=edituser&userid=${hmodel.userid }">Edit</a></td>
	<td><a href="HomeController?action=deleteuser&userid=${hmodel.userid }">Delete</a></td>
</tr>
</table>

<form method="post" action="HomeController">
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
	<td><input type="text" name="username" value="${homemodel.username }"/></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password" value="${homemodel.password }"/>
		<input type="text" name="userid" value="${homemodel.userid }"/>
	</td>
</tr>
<tr>
	<td><input type="submit" name="action" value="Update"/></td>
</tr>
</table>
</form>
</body>
</html>