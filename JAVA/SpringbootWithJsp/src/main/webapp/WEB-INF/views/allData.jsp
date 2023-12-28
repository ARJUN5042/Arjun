<%@page import="com.springbookCrudJsp.SpringbootWithJsp.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Data</h1>

<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Address</th>
<th colspan="2">Action</th>
</tr>
<%
List<User> lists=(List<User>)request.getAttribute("findAll");
for(User u: lists){
%>
<tr>
<td><%=u.getId() %></td>
<td><%=u.getName() %></td>
<td><%=u.getAddress() %></td>
<td><a href="/edit/<%=u.getId() %>">Edit</a></td>
<td><a href="/deleteData/<%=u.getId() %>">Delete</a></td>
</tr>
<%} %>
</table>
<br>
<a href="/register">Add New Data</a>
</body>
</html>