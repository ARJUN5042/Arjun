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
<title>Verify OTP</title>

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
	<%@ include file="header.jsp"%>
	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
			${notmatch }
			<%
			String email=null;
			if(session.getAttribute("otp")==null)
			{
				response.sendRedirect("forgotpassword.jsp");
			}
			else
			{
				CustomerModel f=(CustomerModel)session.getAttribute("UserData");
				email=f.getEmail();
			}
			%>
				<form method="post" action="ForgotController">
					<div class="row">
						<div class="col-lg-8 col-md-6">
							<h6 class="checkout__title">Send OTP Details</h6>
							<div class="row">
							<label>OTP Sent Successfully on &nbsp;<%=email %></label>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											OTP<span>*</span>
										</p>
										<input type="text" name="EnterOTP"
											placeholder="Enter OTP">
									</div>
								</div>
								
								<button type="submit" class="site-btn" name="action" value="verify">Verify</button>
							
							</div>
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
							<input type="text" id="search-input"
								placeholder="Search here.....">
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