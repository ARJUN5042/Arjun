<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validateForm(){
	var name = document.forms["register"]["name"].value;
	var mobile = document.forms["register"]["mobile"].value;
	var email = document.forms["register"]["email"].value;
	var password = document.forms["register"]["password"].value;
	
	if(name === "")
		{
		alert("Name is Empty!");
		return false;
		}
	if(mobile === "" || isNaN(mobile) || mobile.length !== 10)
		{
		alert("Mobile is atleast 10 numbers only");
		return false;
		}
	if(email === "" || !validateEmail(email))
		{
		alert("Please Enter Valid Email!");
		return false;
		}
	if (password === "" || !validatePassword(password)) {
        alert("Password must contain at least one lowercase, one uppercase, one number, one special character and minimum 8 characters");
        return false;
    }
    return true;
}
function validateEmail(email) {
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}

function validatePassword(password) {
    var passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%?&])[A-Za-z\d@$!%?&]{8,}$/;
    return passwordRegex.test(password);
}
</script>
</head>
<body>
	<h1>Register Form</h1>
	<form name="register" method="post" action="save"
		onsubmit="return validateForm()">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>
