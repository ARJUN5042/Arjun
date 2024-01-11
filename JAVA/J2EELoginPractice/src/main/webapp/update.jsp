<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validateForm() {
    var name = document.forms["register"]["name"].value;
    var mobile = document.forms["register"]["mobile"].value;
    var email = document.forms["register"]["email"].value;
    var password = document.forms["register"]["password"].value;

    if (name === "") {
        alert("Name must be filled out");
        return false;
    }
    if (mobile === "" || isNaN(mobile) || mobile.length !== 10) {
        alert("Number must be a 10-digit number");
        return false;
    }
    if (email === "" || !validateEmail(email)) {
        alert("Please enter a valid email address");
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
	<h1>Edit Form</h1>
${msg }
	<form name="register" method="post" action="HomeController"
		onsubmit="return validateForm()">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${m.name }"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" value="${m.mobile }"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" value="${m.email }"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value="${m.password }">
				<input type="hidden" name="id" value="${m.id }"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>