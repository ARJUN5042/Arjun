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
<title>Sub Services</title>
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
							<h4 class="card-title">Sub Services</h4>
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>Sub Service Id</th>
											<th>MainService Name</th>
											<th>Sub Service Name</th>
											<th>Content</th>
											<th>Image</th>
											<th>Price</th>
										</tr>
									</thead>
									<tbody>
										<%
										Connection cn = new DBUtil().getConnectionData();
										String qry = "SELECT subservices.`subid`,services.`servicename`,subservices.`subsname`,subservices.`content`,subservices.`image`,subservices.`price` FROM subservices JOIN services ON services.`serviceid`=subservices.`serviceid`";
										PreparedStatement st = cn.prepareStatement(qry);
										ResultSet rs = st.executeQuery();
										while (rs.next()) {
										%>
										<tr>
											<td><%=rs.getInt(1)%></td>
											<td><%=rs.getString(2)%></td>
											<td><%=rs.getString(3)%></td>
											<td><%=rs.getString(4)%></td>
											<td><img alt="Can't Load Image"
												src="../uploadimage/<%=rs.getString(5)%>"
												style="border-radius: 10%; width: 150px; height: 100px;">
												</div></td>
											<td><%=rs.getString(6)%></td>
										</tr>
										<%
										}
										%>
										<tr>
											<td colspan="4">
												<div class="col-md-6 grid-margin stretch-card">
													<form method="post" action="subservices.jsp"
														class="forms-sample">
														<button type="submit" class="btn btn-primary mr-2"
															name="action">Add SubService</button>
													</form>
												</div>
											</td>
										</tr>
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