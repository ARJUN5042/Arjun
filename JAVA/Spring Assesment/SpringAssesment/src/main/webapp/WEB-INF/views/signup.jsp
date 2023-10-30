<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
    <link rel="stylesheet" type="text/css" href="/static/css/styles.css">
    <script src="/static/js/validation.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp" />
<div class="container">
	<%-- <form id="signupForm" action="<c:url value='/signup-process' />" method="post"> --%>
	<form id="signupForm" action="/signup-process" method="post">
		<div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" id="firstname" name="firstname" class="form-input" required>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" id="lastname" name="lastname" class="form-input" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" class="form-input" required>
                <span id="emailError" class="error-message"></span>
            </div>
             <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" id="mobile" name="mobile" class="form-input" required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" class="form-input" required>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <select id="gender" name="gender" class="form-input" required>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                </select>
            </div>
             <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" class="form-input" required>
                <span id="passwordError" class="error-message"></span>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password:</label>
                <input type="password" id="confirmPassword" name="confirmPassword" class="form-input" required>
                <span id="confirmPasswordError" class="error-message"></span>
            </div>
            <div class="form-group">
                <input type="submit" value="Sign Up" class="btn">
            </div>
	</form>
</div>
</body>
</html>