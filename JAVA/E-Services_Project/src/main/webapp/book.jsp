<%@page import="com.dao.CustomerDao"%>
<%@page import="com.model.CustomerModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Male-Fashion | Template</title>

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
							<h6 class="checkout__title">Booking Service Details</h6>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Fist Name<span>*</span>
										</p>
										<input type="text" name="firstname"
											value="<%=cmodel.getFirstname()%>">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Last Name<span>*</span>
										</p>
										<input type="text" name="firstname"
											value="<%=cmodel.getLastname()%>">
									</div>
								</div>
							</div>
							<div class="checkout__input">
								<p>
									Address<span>*</span>
								</p>
								<input type="text" placeholder="Street Address"
									class="checkout__input__add" name="address"
									value="<%=cmodel.getAddress()%>">
							</div>
							<div class="checkout__input">
								<p>
									Town/City<span>*</span>
								</p>
								<input type="text" name="city" value="<%=cmodel.getCity()%>">
							</div>

							<div class="checkout__input">
								<p>
									Pincode<span>*</span>
								</p>
								<input type="text" name="pincode"
									value="<%=cmodel.getPincode()%>">
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Phone<span>*</span>
										</p>
										<input type="text" name="mobno" value="<%=cmodel.getMobno()%>">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Email<span>*</span>
										</p>
										<input type="text" name="email" value="<%=cmodel.getEmail()%>">
										<input type="text" name="customerid"
											value="<%=cmodel.getCustomerid()%>"> <input
											type="text" name="subid"
											value="<%=request.getParameter("subid")%>">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Sub Service Name<span>*</span>
										</p>
										<input type="text" name="subname"
											value="<%=new CustomerDao().getSubServiceName(Integer.parseInt(request.getParameter("subid")))%>">
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Price<span>*</span>
										</p>
										<input type="text" name="price"
											value="<%=request.getParameter("price")%>">
									</div>
								</div>
							</div>
						</div>

					</div>
					<button type="submit" class="site-btn" name="action"
						value="placeorder">PLACE ORDER</button>
			</div>
		</div>
		</form>
		</div>
		</div>
	</section>
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