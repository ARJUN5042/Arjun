<%@page import="java.util.List"%>
<%@page import="com.model.User"%>
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
	<table border=1>
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Address</td>
			<td>Mobile</td>
			<td>Gender</td>
			<td>Hobbies</td>
			<td>ProfilePic</td>
			<td>Email</td>
			<td>Password</td>
			<td colspan="2">Action</td>
		</tr>
		<%
		User user=(User)request.getAttribute("user");
		%>
		<tr>
			<td><%=user.getId() %></td>
			<td><%=user.getName() %></td>
			<td><%=user.getAddress() %></td>
			<td><%=user.getMobile() %></td>
			<td><%=user.getGender() %></td>
			<td><%=user.getHobbies() %></td>
			<td><img src="image/<%=user.getProfilepic() %>" height="150px" width="150px"></td>
			<td><%=user.getEmail() %></td>
			<td><%=user.getPassword() %></td>
			<td>
			<form method="post" action="HomeController">
			<input type="hidden" name="id" value="<%=user.getId() %>">
				<input type="submit" name="action" value="Edit">
			</form>
			</td>
			<td>
			<form method="post" action="HomeController">
			<input type="hidden" name="id" value="<%=user.getId() %>">
				<input type="submit" name="action" value="Delete">
			</form>
			</td>
		</tr>
	</table>
</body>
</html>