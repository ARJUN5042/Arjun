<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.HBUtil"%>
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
<title>PolluxUI Admin</title>
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
</head>
<body>
	<div class="row" id="proBanner"></div>
	<div class="container-scroller">
		<%@ include file="header.jsp"%>

		<div class="container-fluid page-body-wrapper">
			<%@ include file="sidebar.jsp"%>
			<div class="main-panel">

				<div class="main-panel">
					<div class="content-wrapper">
						<div class="row">
							<div class="col-md-6 grid-margin stretch-card">
								<div class="card">
									<div class="card-body">
										<h4 class="card-title">Sub Service Form</h4>
										<p class="card-description">Sub Service Details</p>
										<form method="post" action="../AdminController"
											class="forms-sample" enctype="multipart/form-data">
											<div class="form-group">
												<label>Main Services</label> <select name="serviceid"
													class="js-example-basic-single w-100">
													<%
													Connection cn = new HBUtil().getConnectionData();
																								String qry = "select * from services";
																								PreparedStatement st = cn.prepareStatement(qry);
																								ResultSet rs = st.executeQuery();
																								while (rs.next()) {
													%>
													<option value="<%=rs.getInt(1)%>"><%=rs.getString(2)%></option>
													<%
													}
													cn.close();
													%>
												</select> <label for="exampleInputUsername1">Sub Service Name</label>
												<input type="text" class="form-control"
													id="exampleInputUsername1" name="subsname"
													placeholder="Enter Sub Service Name">
											</div>
											<div class="form-group">
												<label for="exampleInputUsername1">Content</label> <input
													type="text" class="form-control" id="exampleInputUsername1"
													name="content" placeholder="Enter Content Details">
											</div>
											<div class="form-group">
												<label for="exampleInputUsername1">Images</label> <input
													type="file" class="form-control" id="exampleInputUsername1"
													name="image">
											</div>
											<div class="form-group">
												<label for="exampleInputUsername1">Price</label> <input
													type="text" class="form-control" id="exampleInputUsername1"
													name="price" placeholder="Enter Price">
											</div>

											<button type="submit" class="btn btn-primary mr-2"
												name="action" value="addsubservice">Add Sub Service</button>
											<button class="btn btn-light" name="action" value="cancel">Cancel</button>
										</form>
									</div>
								</div>
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