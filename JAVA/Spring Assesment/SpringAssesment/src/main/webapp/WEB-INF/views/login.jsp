<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    <link rel="stylesheet" type="text/css" href="/static/css/styles.css">
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp" />
<div class="container">
        <h1>Login</h1>
        <%-- <form action="<c:url value='/login-process' />" method="post"> --%>
        <form action="/login-process" method="post">
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" class="form-input" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" class="form-input" required>
            </div>
            <div class="form-group">
                <input type="submit" value="Login" class="btn">
            </div>
        </form>
        <div>
            <a href="/forgot-password">Forgot Password?</a>
        </div>
    </div>
</body>
</html>