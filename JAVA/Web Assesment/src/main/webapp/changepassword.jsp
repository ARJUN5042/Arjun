<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">

function validateForm()
{
	var id=document.getElementById("uid").value;
	var password=document.getElementById("password").value;
	var npassword=document.getElementById("npassword").value
	var confirmPassword=document.getElementById("confirmPassword").value;
	
	if(npassword !== confirmPassword)
		{
		alert("Password and Confirm Password doesn't match!");
		return false;
		}
	return true;
	}

</script>

<body>
<%@ include file="user-header.jsp" %>

<h1>Change Password</h1>
<form action="HomeController" method="post" onsubmit="return validateForm()">
	<table>
	
		<tr>
			<td><label for="password">Enter Old Password: </label></td>
			<td><input type="password" id="password" name="password" required">
			<input type="hidden" id="uid" name="uid" value="${hmodel.uid }"></td>
		</tr>
		<tr>
			<td><label for="npassword">Enter New Password: </label></td>
			<td><input type="password" id="npassword" name="npassword" required></td>
		</tr>
		<tr>
			<td><label for="confirmPassword">Confirm New Password: </label></td>
			<td><input type="password" id="confirmPassword" name="confirmPassword" required></td>
		</tr>
		<tr>
			<td><input type="submit" value="Update"></td>
		</tr>
	</table>
</form>
</body>
</html>