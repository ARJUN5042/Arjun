<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
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
font-size: 20px;
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
	<%
	User user = (User) session.getAttribute("user");
	%>
	<div>
		<h1>User Profile</h1>
	</div>
	<div>
		<nav>
				<button class="button">
					<a href="#">Home</a>
				</button>
				<button class="button">
					<a href="logout">Log Out</a>
				</button>
				<button class="button">
					<a href="changePassword">Change Password</a>
					<input type="hidden" name="id" value="<%=user.getId() %>">
				</button>
		</nav>
	</div>
	<div>
		<table>
			<tr>
				<td>First Name:</td>
				<td><%=user.getFname()%></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><%=user.getLname()%></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><%=user.getEmail()%></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><%=user.getMobile()%></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><%=user.getAddress()%></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="Male"
					<%=user.getGender().equals("Male") ? "checked" : ""%>
					disabled="disabled">Male <input type="radio" name="gender"
					value="Female"
					<%=user.getGender().equals("Female") ? "checked" : ""%>
					disabled="disabled">Female</td>
			</tr>
		</table>
	</div>
</body>
</html>