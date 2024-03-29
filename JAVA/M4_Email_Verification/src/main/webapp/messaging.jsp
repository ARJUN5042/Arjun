<%@page import="java.util.List"%>
<%@page import="org.apache.catalina.tribes.group.interceptors.MessageDispatchInterceptorMBean"%>
<%@page import="com.model.Message"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Message</title>
</head>
<body>
<h1>Message</h1>
<%
	List<Message> messages=(List<Message>)session.getAttribute("messages");
%>
<!-- User's Inbox -->
<div>
	<h2>Inbox</h2>
	<ul>
		<c:forEach items="${messages } var="message">
                <li><strong>From:</strong>${message.senderId }</li>
                <li><strong>Message:</strong>${message.message }</li>
                <hr>
            </c:forEach>

	</ul>
</div>
<!-- Message Form -->
<div>
<h2>Send Message</h2>
<form action="sendMessage" method="post">
	<label for="receiverEmail">To (Email): </label>
	<input type="email" id="receiverEmail" name="receiverEmail" required><br>
	
	<label for="messageContent">Message: </label>
	<textarea id="messageContent" name="messageContent" rows="4" required></textarea><br>
	
	<input type="submit" value="Send">
</form>
</div>
</body>
</html>