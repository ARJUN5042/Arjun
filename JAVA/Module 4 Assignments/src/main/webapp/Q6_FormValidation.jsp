<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	<h1>Form Validation</h1>
	<form name="registrationForm" method="post" action="Q6_FormValidation"
			onsubmit="validateForm()">
		<label>Firstname : </label> <input type="text" name="firstname"
			placeholder="Enter your name"><br>
		<br> <label>Lastname : </label> <input type="text"
			name="lastname" placeholder="Enter Surname"><br>
		<br> <label>Mobile No. : </label> <input type="text"
			name="mobile" placeholder="Enter Mobile Number"><br>
		<br> <label>Email : </label> <input type="email" name="email"
			placeholder="Enter Email Id"><br>
		<br> <label>Password : </label> <input type="password"
			name="password" placeholder="Enter Password"><br>
		<br> <input type="submit" name="action" value="Submit">
	</form>


	<script type="text/javascript">
		function validateForm()
		{

		var firstname = document.forms["registrationForm"]["firstName"].value;
		var lastname = document.forms["registrationForm"]["lastName"].value;
		var email = document.forms["registrationForm"]["email"].value;
		var mobile = document.forms["registrationForm"]["mobile"].value;
		var password = document.forms["registrationForm"]["password"].value;
		if(firstName==""||lastName==""||mobile==""||email==""||password=="")
			{
				alert("All fields are required.");
				return false;
			}
		if(password.length<6)
			{
				alert("Password must be at least 6 characters long.");
				return false;
			}
		if(isNaN(mobile))
			{
			alert("Mobile Number must be a number.");
			return false;
			}
		return true;
		}
	</script>
</body>

</html>