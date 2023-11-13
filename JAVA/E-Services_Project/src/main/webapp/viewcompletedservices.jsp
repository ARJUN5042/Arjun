<%@page import="com.model.SubServiceModel"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.util.DBUtil"%>
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
<title>View Completed Services</title>

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

	<!-- Shopping Cart Section Begin -->
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
				<h2 style="color:#0A0F4E;">View Completed Services</h2>
				<hr>
				<br />
					<div class="shopping__cart__table">
						<table>
							<thead>
								<tr>
									<th>Book Id</th>
									<th>Sub Services Image</th>
									<th>Sub Service Name</th>
									<th>Book Date</th>
									<th>Book Status</th>
									<th>Payment Status</th>
									<th>Serviceman Name</th>
								</tr>
							</thead>
							<tbody>
								<%
								int customerid = Integer.parseInt(request.getParameter("customerid"));
								Connection cn = new DBUtil().getConnectionData();
								String qry = "SELECT book.bid,subservices.`image`,subservices.`subsname`,book.`bdate`,book.`bstatus`,book.`pstatus`,serviceman.`firstname`,serviceman.`lastname`,services.serviceid,subservices.subid,serviceman.servicemanid FROM assignserviceman INNER JOIN book ON book.`bid`=assignserviceman.`bid` INNER JOIN services ON services.`serviceid`=assignserviceman.`serviceid` INNER JOIN subservices ON subservices.`subid`=assignserviceman.`subid` INNER JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` INNER JOIN customer ON customer.`customerid`=assignserviceman.`customerid` WHERE customer.`customerid`=? AND book.`bstatus`='completed'";
								PreparedStatement st = cn.prepareStatement(qry);
								st.setInt(1, customerid);
								ResultSet rs = st.executeQuery();
								while (rs.next()) {
								%>
								<tr>
											<td>
												<h6><%=rs.getInt(1)%></h6>
											</td>
											<td>
												<div class="product__item__pic set-bg" data-setbg="uploadimage/<%=rs.getString(2)%>" style="width:150px; height:150px;"></div>
											</td>
											<td>
												<div class="product__item__text">
												<h6><%=rs.getString(3)%></h6>
												</div>
											</td>
											<td>
												<div class="product__item__text">
												<h6><%=rs.getString(4)%></h6>
												</div>
											</td>
											<td>
												<div class="product__item__text">
												<h6><%=rs.getString(5)%></h6>
												</div>
											</td>
											<td>
												<div class="product__item__text">
												<h6><%=rs.getString(6)%></h6>
												</div>
											</td>
											<td>
												<div class="product_item_text">
												<h6><%=rs.getString(7) %> <%=rs.getString(8) %></h6>
												</div>
											</td>
											<td>
												<form method="post" action="feedback.jsp">
												<input type="hidden" name="bid" value="<%=rs.getString(1) %>">
												<input type="hidden" name="customerid" value="<%=customerid %>">
												<input type="hidden" name="serviceid" value="<%=rs.getString(9) %>">
												<input type="hidden" name="subid" value="<%=rs.getString(10) %>">
												<input type="hidden" name="servicemanid" value="<%=rs.getString(11) %>">
												<button type="submit" class="site-btn" name="action" value="rating_feedback">Give Rating & Feedback</button>
												</form>
											</td>
								</tr>
								<%
								}
								cn.close();
								%>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	<!-- </section> -->
	<!-- Shopping Cart Section End -->




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