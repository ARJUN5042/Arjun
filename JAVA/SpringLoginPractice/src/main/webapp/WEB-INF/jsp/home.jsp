<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<table border="1" cellspacing="1" cellpadding="5">
<tr>
<td>Id</td>
<td>Name</td>
<td>Mobile</td>
<td>Email</td>
<td>Password</td>
<td colspan="2">Action</td>
</tr>
<%
Student s=(Student)session.getAttribute("student");
%>
<tr>
<td><%=s.getId() %></td>
<td><%=s.getName() %></td>
<td><%=s.getMobile() %></td>
<td><%=s.getEmail() %></td>
<td><%=s.getPassword() %></td>
<td><a href="edit/<%=s.getId() %>">Edit</a></td>
<td><a href="delete/<%=s.getId() %>">Delete</a></td>
</tr>
</table>
<br><br>
<a href="logout">LogOut</a>
</body>
</html>