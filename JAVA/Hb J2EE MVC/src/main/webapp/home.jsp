<%@page import="com.model.UserModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	UserModel model=(UserModel)request.getAttribute("model");
%>
<table border="1">
<tr>
	<th>Userid</th>
	<th>FirstName</th>
	<th>LastName</th>
	<th>Username</th>
	<th>Password</th>
	<th colspan="2">Action</th>
</tr>
<tr>
	<td><%=model.getUid() %></td>
	<td><%=model.getFirstname() %></td>
	<td><%=model.getLastname() %></td>
	<td><%=model.getUsername() %></td>
	<td><%=model.getPassword() %></td>
	<td><a href="HomeController?action=edituser&uid=<%=model.getUid() %>">Edit</a></td>
	<td><a href="HomeController?action=deleteuser&uid=<%=model.getUid() %>">Delete</a></td>
</tr>
</table>

<br><br>


</body>
</html>