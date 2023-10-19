<%@page import="com.model.Address"%>
<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
p

	User student=(User)request.getAttribute("student");
	Address address=(Address)request.getAttribute("address");
%>
<table>
<tr>
	<td>Student Name: </td>
	<td><input type="text" name="studentName" value="<%=student.getStudentName() %>"></td>
</tr>
<tr>
	<td>Street: </td>
	<td><input type="text" name="street" value="<%=address.getStreet() %>"></td>
</tr>
<tr>
	<td>City: </td>
	<td><input type="text" name="city" value="<%=address.getCity() %>"></td>
</tr>
<tr>
	<td>State: </td>
	<td><input type="text" name="state" value="<%=address.getState() %>"></td>
</tr>
<tr>
	<td>ZipCode: </td>
	<td><input type="text" name="zipcode" value="<%=address.getZipcode() %>"></td>
</tr>
<tr>
	<td><a href="DataController?action=editUser&studentId=<%=address.getAddressId() %>">Edit</a></td>
	<td><a href="DataController?action=deleteUser&studentId=<%=address.getAddressId() %>">Delete</a></td>
</tr>
</table>
</body>
</html>