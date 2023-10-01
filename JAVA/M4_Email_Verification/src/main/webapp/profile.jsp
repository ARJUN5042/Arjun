<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css" type="text/css">
<title>My Profile</title>
</head>
<body>
<h1>My Profile</h1>
<form action="updateProfile" method="post">
	<label for="firstName">First Name: </label>
	<input type="text" id="firstname" name="firstName" value="${user.firstName }" required><br>
	
	<label for="lastName">Last Name: </label>
	<input type="text" id="lastName" name="lastName" value="${user.lastName }"required><br>
	
	<label for="email">Email: </label>
	<input type="email" id="email" name="email" value="${user.email }"required><br>
	
	<label for="mobile">Mobile: </label>
	<input type="text" id="mobiel" name="mobile" value="${user.mobile }"required><br>
	
	<input type="submit" value="Save Changes">
</form>
</body>
</html>