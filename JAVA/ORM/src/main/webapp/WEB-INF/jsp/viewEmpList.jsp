<%@page import="com.model.EmployeeModel"%>
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
<h1>Employee List</h1>
<table border="1" cellspacing="1" cellpadding="5">
<tr>
<th>Id</th>
<th>Name</th>
<th>Salary</th>
<th>Desg</th>
<th colspan="2">Action</th>
</tr>
<%
List<EmployeeModel> lists=(List<EmployeeModel>)request.getAttribute("lists");
for(EmployeeModel list: lists)
{
%>
<tr>
<td><%=list.getId() %></td>
<td><%=list.getName() %></td>
<td><%=list.getSalary() %></td>
<td><%=list.getDesg() %></td>
<td><a href="edit/<%=list.getId() %>">Edit</a></td>
<td><a href="delete/<%=list.getId() %>">Delete</a></td>
</tr>
<%} %>
</table>
<br>
<a href="empForm">Add New Employee</a>
</body>
</html>