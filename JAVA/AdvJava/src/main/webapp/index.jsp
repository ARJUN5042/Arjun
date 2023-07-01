<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="arjun" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	Date d1 = new Date();
	out.println("Current Date and Time is... "+d1);	
	out.println("<h1>Hello Arjun...");
%>
<br>
<%@ include file="index2.jsp" %>
</body>
</html>