<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Logout</title>
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
<meta http-equiv="refresh" content="3;url=index.jsp">
</head>
<body>
	<div class="row" id="proBanner"></div>
	<div class="container-scroller">
		<%@ include file="i-header.jsp"%>


		<div class="container-fluid page-body-wrapper">
		<%@ include file="i-sidebar.jsp"%>
			<div class="main-panel">
			<div class="content-wrapper">

			<div class="row">
			<div class="col-xl-12 grid-margin stretch-card flex-column">
			<br>
				<h5 class="mb-2 text-titlecase mb-4">You are Successfully Logged Out</h5>
			<p>You will be redirecting to Login Page Shortly....</p>
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