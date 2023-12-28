<%@page import="com.model.User"%>
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
    var address = document.forms["register"]["address"].value;
    var mobile = document.forms["register"]["mobile"].value;
    var gender = document.forms["register"]["gender"].value;
    var hobbies = document.forms["register"]["hobbies"].value;
    var profilepic = document.forms["register"]["profilepic"].value;
    var email = document.forms["register"]["email"].value;
    var password = document.forms["register"]["password"].value;

    if (name === "") {
        alert("Name must be filled out");
        return false;
    }
    if (address === "") {
        alert("Address must be filled out");
        return false;
    }
    if (mobile === "" || isNaN(mobile) || mobile.length !== 10) {
        alert("Number must be a 10-digit number");
        return false;
    }
    if (gender === "") {
        alert("Please select a gender");
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
<%
User user=(User)request.getAttribute("user");
%>
		<h1>Edit Form</h1>
		<form name="register" method="post" action="HomeController" enctype="multipart/form-data" onsubmit="return validateForm()">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" id="name" value="<%=user.getName() %>"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" id="address" value="<%=user.getAddress() %>"></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><input type="text" name="mobile" id="mobile" value="<%=user.getMobile() %>"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="radio" name="gender" value="Male" id="gender" value="Male" <%=user.getGender().equals("Male") ? "checked" : "" %>>Male&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="radio" name="gender" value="Female" id="gender" value="Female" <%=user.getGender().equals("Female") ? "checked" : ""  %>>Female</td>
				</tr>
				<tr>
					<td>Hobbies</td>
					<td><input type="checkbox" name="hobbies" value="Cricket" <%=user.getHobbies().contains("Cricket") ? "checked" : "" %>>Cricket
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="checkbox" name="hobbies" value="Football" <%=user.getHobbies().contains("Football") ? "checked" : "" %>>Football
						 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						 <input type="checkbox" name="hobbies" value="Chess" <%=user.getHobbies().contains("Chess") ? "checked" : "" %>>Chess</td>
				</tr>
				<tr>
					<td>Profile Pic</td>
					<td><input type="file" name="profilepic" id="profilepic" required></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" id="email" value="<%=user.getEmail() %>"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" id="password" value="<%=user.getPassword() %>">
					<input type="text" name="id" id="id" value="<%=user.getId() %>">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" name="action" value="Update Data"></td>
				</tr>
			</table>
		</form>
</body>
</html>