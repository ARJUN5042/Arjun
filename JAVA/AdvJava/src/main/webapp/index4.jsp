<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
<jsp:forward page="index5.jsp">
	<jsp:param value="arjun" name="ename"/>
	<jsp:param value="12345" name="salary"/>
</jsp:forward>
 
<%-- <jsp:include page="index5.jsp">
	<jsp:param value="arjun" name="ename"/>
	<jsp:param value="12345" name="salary"/>
</jsp:include> --%>

<h1>Arjun Hirpara</h1>
</body>
</html>