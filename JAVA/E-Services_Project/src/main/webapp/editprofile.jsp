<%@page import="com.model.CustomerModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Edit Profile</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">

</head>
<body>

<%@ include file="cust-header.jsp"%>
<%
	CustomerModel cmodel = (CustomerModel) session.getAttribute("model");
	%>
<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<form method="post" action="CustomerController">
					<div class="row">
						<div class="col-lg-8 col-md-6">
							<h6 class="checkout__title">Edit User Form</h6>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Firstname<span>*</span>
										</p>
										<input type="text" name="firstname" value="<%=cmodel.getFirstname() %>">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Lastname<span>*</span>
										</p>
										<input type="text" name="lastname"  value="<%=cmodel.getLastname() %>">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Gender<span>*</span>
										</p>
										<label> <input type="radio"
											style="height: 14px; width: 14px; margin-right: 10px"
											name="gender" value="Male" <%= cmodel.getGender().equals("Male") ? "checked" : "" %>>Male&nbsp;&nbsp;
										</label> <label><input type="radio"
											style="height: 14px; width: 14px; margin-right: 10px"
											name="gender" value="Female" <%= cmodel.getGender().equals("Female") ? "checked" : "" %>>Female&nbsp;&nbsp;
											</label> <label><input type="radio"
											style="height: 14px; width: 14px; margin-right: 10px"
											name="gender" value="Transgender" <%= cmodel.getGender().equals("Transgender") ? "checked" : "" %>>Transgender</label>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Address<span>*</span>
										</p>
										<label> <textarea id="address"
												style="border: 1px solid #e1e1e1; color: #b7b7b7;" name="address" rows="4"
												cols="41"><%=cmodel.getAddress() %></textarea>
										</label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											City<span>*</span>
										</p>
										<input type="text" name="city"  value="<%=cmodel.getCity() %>">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Pincode<span>*</span>
										</p>
										<input type="text" name="pincode"
											 value="<%=cmodel.getPincode() %>">
											 <input type="hidden" name="customerid" value="<%=cmodel.getCustomerid() %>">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Mobile Number<span>*</span>
										</p>
										<input type="number" name="mobno"
											 value="<%=cmodel.getMobno() %>">
									</div>
								</div>
							</div>
							
							<button type="submit" class="site-btn" name="action" value="updateprofile">Update Profile</button>
							
						</div>

					</div>
				</form>
<br>
<%@ include file="footer.jsp"%>

	<!-- Search Begin -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">+</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search End -->

	<!-- Js Plugins -->
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/jquery.countdown.min.js"></script>
	<script src="js/jquery.slicknav.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>
</body>

</html>