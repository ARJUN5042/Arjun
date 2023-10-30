<%@page import="com.model.UserModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp"%>
${notmatch }
<%
String email=null;
if(session.getAttribute("otp")==null)
{
	response.sendRedirect("forgotpassword.jsp");
}
else
{
	UserModel f=(UserModel)session.getAttribute("UserData");
	email=f.getEmail();
}
%>
<h1>Send OTP Details</h1>
<form action="ForgotController" method="post">
<table>
	<tr>
		<td colspan="2"><p>Otp has been sent on , &nbsp;<%=email %></td>
	</tr>
	<tr>
		<td>Enter OTP:</td>
		<td><input type="text" id="EnterOTP" name="EnterOTP"></td>
	</tr>
	<tr>
		<td><input type="submit" name="action" value="Verify"></td>
	</tr>
</table>
</form>
</body>
</html>