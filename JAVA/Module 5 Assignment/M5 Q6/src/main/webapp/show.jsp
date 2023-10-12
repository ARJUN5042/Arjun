<%@page import="com.model.Item"%>
<%@page import="com.model.Cart"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
Cart cart=(Cart)request.getAttribute("cart");
Item item=(Item)request.getAttribute("item");
%> --%>
<table>
<tr>
	<td>Cart name:</td>
	<td><input type="text" name="name" value="${cart.name }">
	<input type="hidden" name="cartId" value="${cart.cartId }"></td>
</tr>
<tr>
	<td>Item Total:</td>
	<td><input type="text" name="total" value="${cart.total }">
	<input type="hidden" name="cartId" value="${cart.cartId }"></td>
</tr>
<tr>
	<td>Item Name:</td>
	<td><input type="text" name="itemName" value="${item.itemName }">
	<input type="hidden" name="id" value="${item.id }"></td>
</tr>
<tr>
	<td>Item Quantity:</td>
	<td><input type="text" name="quantity" value="${item.quantity }">
	<input type="hidden" name="id" value="${item.id }"></td>
</tr>
<tr>
	<td>Item Total:</td>
	<td><input type="text" name="itemTotal" value="${item.itemTotal }">
	<input type="hidden" name="id" value="${item.id }"></td>
</tr>
<tr>
	<td><a href="DataController?action=editcart">Edit</a></td>
	<td><a href="DataController?action=deletecart">Delete</a></td>
</tr>
</table>
</body>
</html>