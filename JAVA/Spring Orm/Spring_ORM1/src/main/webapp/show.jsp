<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="com.dao.UserDao"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	UserDao studentDao=(UserDao)a.getBean("studentDao");
	List<User> list=studentDao.getAllStudent();
%>
<table border="1">
<tr>
	<th>Sid</th>
	<th>Name</th>
	<th>City</th>
	<th>Actions</th>
</tr>
<%
for(User s: list)
	{
%>
<tr>
	<td><%=s.getSid() %></td>
	<td><%=s.getName() %></td>
	<td><%=s.getCity() %></td>
	<td>
			<form name="edit" method="post" action="ActionController">
				<input type="hidden" name="sid" value="<%=s.getSid()%>">
				<input type="submit" name="action" value="EDIT">
			</form>
		</td>
		<td>
			<form name="delete" method="post" action="ActionController">
				<input type="hidden" name="sid" value="<%=s.getSid()%>">
				<input type="submit" name="action" value="DELETE">
			</form>
		</td>
</tr>
<%
	}
%>

</table>
</body>
</html>