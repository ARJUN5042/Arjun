<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reset Password</title>
<link rel="stylesheet" type="text/css" href="/static/css/styles.css">
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp" />
<div class="container">
        <h1>Reset Password</h1>
        <%-- <form action="<c:url value='/reset-password-process' />" method="post"> --%>
        <form action="/reset-password-process" method="post">
            <div class="form-group">
                <label for="newPassword">New Password:</label>
                <input type="password" id="newPassword" name="newPassword" class="form-input" required>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm New Password:</label>
                <input type="password" id="confirmPassword" name="confirmPassword" class="form-input" required>
            </div>
            <div class="form-group">
                <input type="submit" value="Reset Password" class="btn">
            </div>
        </form>
    </div>
</body>
</html>