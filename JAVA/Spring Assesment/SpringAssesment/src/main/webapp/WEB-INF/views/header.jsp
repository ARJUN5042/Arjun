<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Signup/Login Demo</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/styles.css" />">
</head>
<body>
    <header>
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="#">User Signup/Login Demo</a>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/index.jsp' />">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/signup' />">Sign Up</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/login' />">Login</a>
                </li>
            </ul>
        </nav>
    </header>
</body>
</html>
