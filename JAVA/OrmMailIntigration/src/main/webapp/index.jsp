<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.display-back {
	display: none;
}

body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
}

h1 {
	text-align: center;
	color: navy;
}

form {
	background-color: #fff;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 500px;
	box-sizing: border-box;
	margin-top: 20px; /* Adjust as needed */
}

table {
	width: 100%;
}

td {
	padding: 10px;
}

input {
	width: auto;
	padding: 10px;
	margin-bottom: 10px;
	box-sizing: border-box;
}

.gender-group {
	display: flex;
	justify-content: space-between;
}

.gender-group input {
	width: 40%; /* Adjust as needed */
}

.button {
	background-color: navy;
	border: 1px solid #2a2a38;
	border-radius: 20px;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	font-size: 16px;
	cursor: pointer;
}
a{
text-decoration: none;
}
a:link {
  color: white;
}

a:visited {
  color: white;
}

a:hover {
  color: white;
}

a:active {
  color: white;
}
.error {
	color: red;
}
</style>
</head>
<body>
<h1>Home Page</h1>
<nav>
<h2>
<button class="button"><a href="#">Home</a></button>
<button class="button"><a href="signup">Sign Up</a></button>
<button class="button"><a href="login">Login</a></button>
</h2>
</nav>
</body>
</html>