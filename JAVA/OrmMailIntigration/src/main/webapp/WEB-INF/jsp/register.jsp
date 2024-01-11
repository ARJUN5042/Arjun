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
            display: inline-block;
            font-size: 16px;
            width: 100%;
            cursor: pointer;
        }

        .error {
            color: red;
        }
</style>
<script type="text/javascript">
	function validateForm() {
		var fname = document.forms["register"]["fname"].value;
		var lname = document.forms["register"]["lname"].value;
		var email = document.forms["register"]["email"].value;
		var mobile = document.forms["register"]["mobile"].value;
		var address = document.forms["register"]["address"].value;
		var gender = document.forms["register"]["gender"].value;
		var password = document.forms["register"]["password"].value;
		var confirmPassword = document.forms["register"]["confirmPassword"].value;

		if (fname === "") {
			alert("First Name must be filled out");
			return false;
		}
		if (lname === "") {
			alert("Last Name must be filled out");
			return false;
		}
		if (email === "" || !validateEmail(email)) {
			alert("Please enter a valid email address");
			return false;
		}
		if (mobile === "" || isNaN(mobile) || mobile.length !== 10) {
			alert("Number must be a 10-digit number");
			return false;
		}
		if (address === "") {
			alert("Address must be filled out");
			return false;
		}
		if (gender === "") {
			alert("Please select a gender");
			return false;
		}
		if (password === "" || !validatePassword(password)) {
			alert("Password must contain at least one lowercase, one uppercase, one number, one special character and minimum 8 characters");
			return false;
		}
		if (password !== confirmPassword) {
			alert("Passwords do not match");
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
	<div>
		<h1>Registration Form</h1>
	</div>
	<div>
		<form name="register" method="post" action="save"
			onsubmit="return validateForm()">
			<table>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lname"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Mobile:</td>
					<td><input type="text" name="mobile"></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><input type="radio" name="gender" value="Male">Male
						<input type="radio" name="gender"
						value="Female">Female</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmPassword"></td>
				</tr>
				<tr>
					<td>
						<p class="error" id="passwordError"></p> <input type="submit"
						class="button" value="Submit">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>