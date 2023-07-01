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
	String ename=request.getParameter("ename");
	String salary=request.getParameter("salary");
%>
<%= "Ename is.. "+ename %><br>
<%= "Salary is.. "+salary  %><br>

</body>
</html>