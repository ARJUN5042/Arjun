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
<title>View Bookd Services</title>

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
				<div class="col-lg-8">
					<div class="shopping__cart__table">
						<table>
							<thead>
								<tr>
									<th>Book Id</th>
									<th>Sub Services Image</th>
									<th>Sub Service Name</th>
									<th>Sub Service Price</th>
									<th>Book Date</th>
									<th>Payment Status</th>
								</tr>
							</thead>
							<tbody>
								<%
								int customerid = Integer.parseInt(request.getParameter("customerid"));
								Connection cn = new DBUtil().getConnectionData();
								String qry = "select book.bid,subservices.image,subservices.subsname,subservices.price,book.bdate,book.pstatus from book inner join subservices on book.subid=subservices.subid where book.customerid=? order by book.bid ASC";
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
												<div class="product__item__pic set-bg" data-setbg="uploadimage/<%=rs.getString(2)%>"></div>
											</td>
											<td>
												<div class="product__item__text">
												<h6><%=rs.getString(3)%></h6>
												</div>
											</td>
											<td>
												<div class="product__item__text">
												<h6><%=rs.getString(4)%> Rs.</h6>
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