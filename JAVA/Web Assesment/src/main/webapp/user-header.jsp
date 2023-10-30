<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="index.css">
<link rel="stylesheet" type="text/css" href="register.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">${hmodel.firstname } ${hmodel.lastname }</a>
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="user-home.jsp">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="logout.jsp">Log Out</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="changepassword.jsp?uid=${hmodel.uid }">Change Password</a>
        </li>
    </ul>
</nav>
</body>
</html>