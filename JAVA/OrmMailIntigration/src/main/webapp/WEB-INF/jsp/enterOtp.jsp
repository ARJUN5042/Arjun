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
	width: 50%;
	cursor: pointer;
}

a {
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
<script type="text/javascript">
function validateOtp(){
	var otp = document.forms["otpForm"]["otp"].value;
	
	if(otp === ""){
		alert("Please enter the OTP");
		return false;
	}
	return true;
}
</script>
</head>
<body>
	<div>
		<h1>Enter OTP</h1>
	</div>
	<div>
		<form name="otpForm" method="post" action="verifyOtp"
			onsubmit="return validateOtp()">
			<table>
				<tr>
					<td>Enter OTP sent to your email:</td>
					<td><input type="text" name="otp"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" class="button" value="Get OTP">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>