<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Single Data</title>
</head>
<body>
<h1>Single Data Page</h1>
<%
	out.print("The User data is : ");
	out.print(session.getAttribute("user"));
%>


<br>
<br>

<h1>By Expression Language</h1>

${user }


</body>
</html>