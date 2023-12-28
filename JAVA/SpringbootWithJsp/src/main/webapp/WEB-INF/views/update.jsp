<%@page import="com.springbookCrudJsp.SpringbootWithJsp.User"%>
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
<%
User user=(User)session.getAttribute("u");
%>
<form action="${pageContext.request.contextPath}/updateForm" method="post">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name" value="<%=user.getName() %>"></td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" name="address" value="<%=user.getAddress() %>">
<input type="hidden" name="id" value="<%=user.getId() %>"></td>
</tr>
<tr>
<td><button type="submit">Update</button></td>
</tr>
</table>
</form>
</body>
</html>