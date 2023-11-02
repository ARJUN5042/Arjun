<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<div class="row">
					<div class="col-lg-8 col-md-6">
						<h6 class="checkout__title">Customer Details</h6>
						<%
						int customerid=Integer.parseInt(request.getParameter("customerid"));
            			Connection cn=new DBUtil().getConnectionData();
                        String qry="select * from customer where customerid=?";
                        PreparedStatement st=cn.prepareStatement(qry);
                        st.setInt(1, customerid);
                        ResultSet rs=st.executeQuery();
                        while(rs.next())
                        {
            			%>
						<div class="row">
							<div class="col-lg-6">
								<div class="checkout__input">
									<p>
										Firstname<span>*</span>
									</p>
									<input type="text" name="firstname" value="<%=rs.getString(2) %>" readonly>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="checkout__input">
									<p>
										Lastname<span>*</span>
									</p>
									<input type="text" name="lastname" value="<%=rs.getString(3)%>" readonly>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-lg-6">
								<div class="checkout__input">
									<p>
										Gender<span>*</span>
									</p>
									<label> <input type="text" name="gender" value="<%=rs.getString(4)%>" readonly></label>
								</div>
							</div>
							<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Address<span>*</span>
										</p>
										<label> <textarea id="address" name="address" rows="4"
												cols="41" readonly><%=rs.getString(5)%></textarea>
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
									<input type="text" name="city"  value="<%=rs.getString(6)%>" readonly>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="checkout__input">
									<p>
										Pincode<span>*</span>
									</p>
									<input type="text" name="pincode" value="<%=rs.getString(7)%>" readonly>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-lg-6">
								<div class="checkout__input">
									<p>
										Mobile Number<span>*</span>
									</p>
									<input type="number" name="mobno" value="<%=rs.getString(8)%>" readonly>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="checkout__input">
									<p>
										Email<span>*</span>
									</p>
									<input type="email" name="email" value="<%=rs.getString(9)%>" readonly>
								</div>
							</div>
						</div>
						<%
						}
						%>
						<button type="submit" class="site-btn" name="action"
							value="register">Edit Profile</button>
					</div>
				</div>
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