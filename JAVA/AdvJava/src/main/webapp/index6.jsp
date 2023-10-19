<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s1" class="com.model.User"></jsp:useBean>
<jsp:setProperty property="sid" name="s1" value="123"/>
<jsp:setProperty property="sname" name="s1" value="Rahul"/>
<jsp:setProperty property="city" name="s1" value="S.nagar"/>
<jsp:setProperty property="degree" name="s1" value="MCA"/>

<jsp:useBean id="s2" class="com.model.User"></jsp:useBean>
<jsp:setProperty property="sid" name="s2" value="321"/>
<jsp:setProperty property="sname" name="s2" value="Arjun"/>
<jsp:setProperty property="city" name="s2" value="G.nagar"/>
<jsp:setProperty property="degree" name="s2" value="BCA"/>

<table border="1">
<tr>
	<th>Sid</th>
	<th>Sname</th>
	<th>City</th>
	<th>Degree</th>
</tr>
<tr>
	<td><jsp:getProperty property="sid" name="s1"/></td>
	<td><jsp:getProperty property="sname" name="s1"/></td>
	<td><jsp:getProperty property="city" name="s1"/></td>
	<td><jsp:getProperty property="degree" name="s1"/></td>
</tr>
<tr>
	<td><%= s2.getSid() %></td>
	<td><%= s2.getSname() %></td>
	<td><%= s2.getCity() %></td>
	<td><%= s2.getDegree() %></td>
</tr>
</table>
</body>
</html>