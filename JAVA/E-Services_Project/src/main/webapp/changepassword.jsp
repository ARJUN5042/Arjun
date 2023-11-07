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
<title>Change Password</title>

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
<script>
function validateForm()
{
	var npassword=document.getElementById("npassword").value;
	var cnpassword=document.getElementById("cnpassword").value;
	
	if(npassword !== cnpassword)
		{
			alert("New Password and Re-entered password do not match!");
			return false;
		}
	return true;
	
}
</script>
</head>
<body>
<%
	CustomerModel cmodel = (CustomerModel) session.getAttribute("model");
%>
	<%@ include file="cust-header.jsp"%>
	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<form method="post" action="CustomerController" onsubmit="return validateForm();">
					<div class="row">
						<div class="col-lg-8 col-md-6">
							<h6 class="checkout__title">Change Password Details</h6>
							<div class="row">

								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Enter Old Password<span>*</span>
										</p>
										<input type="password" name="password" id="password"
											placeholder="Enter Old Password Here">
											<input type="hidden" id="customerid" name="customerid" value="<%=cmodel.getCustomerid() %>">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>Enter New Password<span>*</span></p>
										<input type="password" name="npassword" id="npassword"
											placeholder="Enter New Password" required>
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>Re-Enter New Password<span>*</span></p>
										<input type="password" name="cnpassword" id="cnpassword"
											placeholder="Re-Enter New Password" required>
									</div>

								</div>
								
									<button type="submit" class="site-btn" style="margin: 15px;" name="action"
										value="savepassword">Confirm</button>
								
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