<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<h1>Reset Password Page</h1>
	<form action="ForgotController" method="post">
		<table>
			<tr>
				<td>Enter New Password:</td>
				<td><input type="password" name="newpassword" id="newpassword"></td>
			</tr>
			<tr>
				<td>Confirm New Password:</td>
				<td><input type="password" name="Cpassword" id="Cpassword"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Confirm"></td>
			</tr>
		</table>
	</form>
</body>
</html>