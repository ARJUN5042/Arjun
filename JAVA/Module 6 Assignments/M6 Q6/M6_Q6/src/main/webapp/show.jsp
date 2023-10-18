<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.UserDao"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User</title>
</head>
<body>
<%
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	UserDao userDao=(UserDao)context.getBean("userDao");
	List<User> list=userDao.getAllUser();
%>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<%
			for(User user: list)
			{
		%>
		<tr>
			<td><%=user.getId() %></td>
			<td><%=user.getName() %></td>
			<td><%=user.getEmail() %></td>
			<td>
				<form name="query" method="post" action="ActionController">
				<input type="hidden" name="id" value="<%=user.getId()%>">
				<input type="submit" name="action" value="Query">
			</form>
			</td>
			<td>
				<form name="edit" method="post" action="ActionController">
				<input type="hidden" name="id" value="<%=user.getId()%>">
				<input type="submit" name="action" value="edit">
			</form>
			</td>			
			<td>
				<form name="delete" method="post" action="ActionController">
				<input type="hidden" name="id" value="<%=user.getId()%>">
				<input type="submit" name="action" value="delete">
			</form>
			</td>
		</tr>
		<%
			}
		%>
	</table>
	
	<h3><a href="register.jsp">Add User</a></h3>
</body>
</html>