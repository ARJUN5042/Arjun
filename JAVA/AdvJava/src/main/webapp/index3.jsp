<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int x=10,y=20; %> <!-- Declaration Scripting elements -->

<%
	out.println("Sum is... "+(x+y));
%> <!-- Scriptlet Scripting elements -->
<br>
<%= "Sum == "+(x+y) %>
<br>
<%= 5+6+7+8+9-10 %> <!-- Expression Scripting elements -->
</body>
</html>