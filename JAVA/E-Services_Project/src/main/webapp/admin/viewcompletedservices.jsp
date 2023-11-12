<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Completed Services</title>
<!-- base:css -->
<link rel="stylesheet" href="vendors/typicons/typicons.css">
<link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="css/vertical-layout-light/style.css">
<!-- endinject -->
<link rel="shortcut icon" href="images/favicon.png" />
<style>
@media ( min-width : 992px) {
	.col-lg-6 {
		min-width: calc(100% - 36px);
		margin-left: 19px;
	}
}
</style>
</head>
<body>
	<div class="row" id="proBanner"></div>
	<div class="container-scroller">
		<%@ include file="header.jsp"%>


		<div class="container-fluid page-body-wrapper">
			<%@ include file="sidebar.jsp"%>

			<div class="main-panel">

				<div class="col-lg-6 grid-margin stretch-card">
					<div class="card">
						<div class="card-body">
							<h4 class="card-title">Completed Services</h4>
							<div class="table-responsive">
								<table class="table" cellpadding="10">
									<thead>
										<tr>
											<th>Bid</th>
											<th>Cid</th>
											<th>Service Name</th>
											<th>Sub Service Name</th>
											<th>Booking Date</th>
											<th>Price</th>
											<th>Book Status</th>
											<th>Show Rating & Feedback</th>
										</tr>
									</thead>
									<tbody>
										<%
										Connection cn = new DBUtil().getConnectionData();
										String qry="SELECT book.`bid`,customer.`customerid`,customer.`firstname`,services.`servicename`,subservices.`subsname`,book.`bdate`,book.`price`,book.`bstatus`,book.pstatus,services.serviceid,subservices.subid FROM book INNER JOIN subservices ON book.`subid`=subservices.`subid` INNER JOIN customer ON book.`customerid`=customer.`customerid` INNER JOIN services ON subservices.`serviceid`=services.`serviceid` where book.bstatus='completed'";
										PreparedStatement st = cn.prepareStatement(qry);
										ResultSet rs = st.executeQuery();
										while (rs.next()) {
										%>
										<tr>
											<td><%=rs.getInt(1)%></td>
											<td><%=rs.getInt(2)%></td>
											<td><%=rs.getString(4)%></td>
											<td><%=rs.getString(5)%></td>
											<td><%=rs.getString(6)%></td>
											<td><%=rs.getString(7)%></td>
											<td><%=rs.getString(8)%></td>
											<td>
											<div class="col-md-6 grid-margin stretch-card">
													<form method="post" action="../AdminController"
														class="forms-sample">
														<input type="hidden" name="bid" value="<%= rs.getInt(1) %>">
														<button type="submit" class="btn btn-primary mr-2"
															name="action" value="rating">Show Rating</button>
													</form>
												</div>
											</td>
										</tr>
										<%
										}
										%>
										
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>



				<%@ include file="footer.jsp"%>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->

	<!-- base:js -->
	<script src="vendors/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page-->
	<script src="vendors/chart.js/Chart.min.js"></script>
	<!-- End plugin js for this page-->
	<!-- inject:js -->
	<script src="js/off-canvas.js"></script>
	<script src="js/hoverable-collapse.js"></script>
	<script src="js/template.js"></script>
	<script src="js/settings.js"></script>
	<script src="js/todolist.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script src="js/dashboard.js"></script>
	<!-- End custom js for this page-->
</body>
</html>