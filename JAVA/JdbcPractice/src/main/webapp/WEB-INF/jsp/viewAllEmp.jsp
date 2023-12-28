<%@page import="com.model.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee List</h1>
<table border="1" cellspacing="1" cellpadding="3">
<tr>
<th>Id</th>
<th>Name</th>
<th>Salary</th>
<th>Desg</th>
<th colspan="2">Action</th>
</tr>
<%
List<Emp> emp=(List<Emp>)request.getAttribute("lists");
for(Emp e: emp){
%>
<tr>
<td><%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getSalary() %></td>
<td><%=e.getDesg() %></td>
<td><a href="edit/<%=e.getId() %>">Edit</a></td>
<td><a href="delete/<%=e.getId() %>">Delete</a></td>
</tr>
<%} %>
</table>

<br>
<a href="empForm">Add New Employee</a>
</body>
</html>