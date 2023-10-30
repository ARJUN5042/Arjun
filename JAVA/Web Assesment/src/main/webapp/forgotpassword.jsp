<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function validateForm() {
		var email = document.getElementById("email").value;

		if (email === "") {
			alert("Blank field is not allowed!");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<%@ include file="header.jsp"%>
	${invalidemail }
	<h1>Forgot Password Form</h1>
	<form action="ForgotController" method="post"
		onsubmit="return validateForm()">
		<table>
			<tr>
				<td><label for="email">Email: </label></td>
				<td><input type="email" id="email" name="email" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" name="action"></td>
			</tr>
		</table>
	</form>
</body>
</html>