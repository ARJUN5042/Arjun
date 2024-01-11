<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>View All Data</h1>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Mobile</td>
			<td>Email</td>
			<td>Password</td>
			<td>Action</td>
		</tr>
		<c:forEach var="lists" items="${lists }">
			<tr>
				<td>${lists.id }</td>
				<td>${lists.name }</td>
				<td>${lists.mobile }</td>
				<td>${lists.email }</td>
				<td>${lists.password }</td>
				<td><form action="HomeController" method="post">
						<input type="text" name="id" value="${lists.id }">
						<input type="submit" name="action" value="Delete">
					</form></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>