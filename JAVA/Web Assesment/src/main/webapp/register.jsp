<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

function validateForm()
{
	var firstname=document.getElementById("firstname").value;
	var lastname=document.getElementById("lastname").value;
	var email=document.getElementById("email").value;
	var mobile=document.getElementById("mobile").value;
	var address=document.getElementById("address").value;
	var gender=document.getElementById("gender").value;
	var password=document.getElementById("password").value;
	var confirmPassword=document.getElementById("confirmPassword").value;
	
	if(firstname===""||lastname===""||email===""||mobile===""||address===""||gender===""||password===""||confirmPassword==="")
		{
		alert("All fields are required!");
		return false;
		}
	
	if(password !== confirmPassword)
		{
		alert("Password and Confirm Password doesn't match!");
		return false;
		}
	return true;
	}

</script>
</head>
<body>


<%@ include file="header.jsp" %>

<h1>Registration Form</h1>
<form action="RegistrationController" method="post" onsubmit="return validateForm()">
	<table>
		<tr>
			<td><label for="firstname">First Name: </label></td>
			<td><input type="text" id="firstname" name="firstname" required></td>
		</tr>
		<tr>
			<td><label for="lastname">Last Name: </label></td>
			<td><input type="text" id="lastname" name="lastname" required></td>
		</tr>
		<tr>
			<td><label for="email">Email: </label></td>
			<td><input type="email" id="email" name="email" required></td>
		</tr>
		<tr>
			<td><label for="mobile">Mobile: </label></td>
			<td><input type="tel" id="mobile" name="mobile" required></td>
		</tr>
		<tr>
			<td><label for="address">Address: </label></td>
			<td><input type="text" id="address" name="address" required></td>
		</tr>
		<tr>
			<td><label for="gender">Gender: </label></td>
			<td><input type="radio" id="gender" name="gender" value="Male" required>Male 
			<input type="radio" id="gender" name="gender" value="Female" required>Female</td>
		</tr>
		<tr>
			<td><label for="password">Password: </label></td>
			<td><input type="password" id="password" name="password" required></td>
		</tr>
		<tr>
			<td><label for="confirmPassword">Confirm Password: </label></td>
			<td><input type="password" id="confirmPassword" name="confirmPassword" required></td>
		</tr>
		<tr>
			<td><input type="submit" value="Register"></td>
		</tr>
	</table>
</form>
</body>
</html>