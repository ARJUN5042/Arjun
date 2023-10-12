<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="HomeController" enctype="multipart/form-data">
<table>
<tr>
	<td>First Name : </td>
	<td><input type="text" name="firstname" value="${user.firstname }"/></td>
</tr>
<tr>
	<td>Last Name : </td>
	<td><input type="text" name="lastname" value="${user.lastname }"/></td>
</tr>
<tr>
	<td>Email : </td>
	<td><input type="email" name="email"  value="${user.email }"/></td>
</tr>
<tr>
	<td>Mobile : </td>
	<td><input type="text" name="mobile"  value="${user.mobile }"/></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password" value="${user.password }"/>
	<input type="hidden" name="id" value="${user.id }"/>
	</td>
</tr>
<tr>
	<td>Gender : </td>
	<td><input type="radio" name="gender"  value="${user.gender }"/>Male &nbsp;&nbsp;
	<input type="radio" name="gender"  value="${user.gender }"/>Female
	</td>
</tr>
<tr>
	<td>Profile Picture : </td>
	<td><input type="file" name="image" value="${user.image }"/>
	</td>
</tr>
<tr>
	<td><input type="submit" value="Update"/></td>
</tr>
</table>
</form>
</body>
</html>