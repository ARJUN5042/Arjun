<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>
<link rel="stylesheet" type="text/css" href="/static/css/styles.css">
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />
	<div class="container">
		<h1>Forgot Password</h1>
		<%-- <form action="<c:url value='/forgot-password-process' />" method="post"> --%>
		<form action="/forgot-password-process" method="post">
			<div class="form-group">
				<label for="email">Email:</label> 
				<input type="email" id="email" name="email" class="form-input" required>
			</div>
			<div class="form-group">
				<input type="submit" value="Send Reset Link" class="btn">
			</div>
		</form>
	</div>
</body>
</html>