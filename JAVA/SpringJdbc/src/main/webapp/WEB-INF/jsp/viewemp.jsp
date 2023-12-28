<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Emp</title>
</head>
<body>
View Emp
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Salary</th>
<th>Desg</th>
<th colspan="2">Action</th>
</tr>
<c:forEach var="emp" items="${lists }">
<tr>
<td>${emp.id }</td>
<td>${emp.name }</td>
<td>${emp.salary }</td>
<td>${emp.desg }</td>
<td>
<a href="editemp/${emp.id }">Edit</a>
</td>
<td>
<a href="deleteemp/${emp.id }">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>