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
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Desg</th>
	</tr>
	<c:forEach var="lists" items="${lists }">
	<tr>
		<td>${lists.id }</td>
		<td>${lists.name }</td>
		<td>${lists.salary }</td>
		<td>${lists.desg }</td>
		<td><a href="editemp/${lists.id }">Edit</a></td>
		<td><a href="deleteemp/${lists.id }">Delete</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>