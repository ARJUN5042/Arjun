<%@page import="com.model.User"%>
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
User s=(User)request.getAttribute("s");
%>
<form method="post" action="ActionController">
Enter Name: <input type="text" name="name" value="<%= s.getName()%>"><br>
Enter City: <input type="text" name="city" value="<%= s.getCity()%>"><input type="hidden" name="sid" value="<%= s.getSid()%>"><br>
<input type="submit" name="action" value="update">
</form>
</body>
</html>