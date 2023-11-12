<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<style>
		body {
			height: 100vh;
			margin: 0;
			background-color: #f1f1f1;
			display: flex;
			justify-content: center;
			align-items: center;
		}
		.container {
			background-color: #fff;
			border-radius: 10px;
			box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.2);
			padding: 20px;
			width: 30%;
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
			text-align: center;
		}
		input[type=text], input[type=password] {
			border-radius: 5px;
			border: none;
			box-shadow: 0px 0px 5px 0px rgba(0,0,0,0.2);
			margin: 5px 0px;
			padding: 10px;
			width: 90%;
		}
		input[type=submit] {
			background-color: #4CAF50;
			border: none;
			border-radius: 5px;
			color: white;
			cursor: pointer;
			margin: 5px auto;
			padding: 10px;
			width: 50%;
		}
		input[type=submit]:hover {
			background-color: #45a049;
		}
	</style>
</head>
<body>
	<div class="container">
		<h2>Login Form</h2>
		${msg }
		<form method="post" action="../AdminController">
		<table>
		<tr><th>
			<label for="username">Username:</label></th>
			<td>
			<input type="text" id="username" name="username" placeholder="Enter your username" required>
			</td>
			</tr>
			<tr>
			<th>
			<label for="password">Password:</label>
			</th>
			<td>
			<input type="password" id="password" name="password" placeholder="Enter your password" required>
			</td>
			</tr>
			<tr>
			<td colspan="2">
			<input type="submit" name="action" value="Login">
			</td>
			</tr>
			</table>
		</form>
	</div>
</body>
</html>
	