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
<title>Assign Services</title>
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
							<h4 class="card-title">Select ServiceMan</h4>
							<div class="table-responsive">
							<form method="post" action="../AdminController">
								<table class="table" cellpadding="10">
									
									<tbody>
									<tr>
										<%
										int bid=Integer.parseInt(request.getParameter("bid"));
										int customerid=Integer.parseInt(request.getParameter("customerid"));
										int serviceid=Integer.parseInt(request.getParameter("serviceid"));
										int subid=Integer.parseInt(request.getParameter("subid"));
										Connection cn=new DBUtil().getConnectionData();
										String qry="SELECT serviceman.`servicemanid`,serviceman.`firstname`,serviceman.`lastname`,services.`serviceid`,subservices.`subid`,book.`bid`,customer.`customerid` FROM serviceman INNER JOIN services ON serviceman.`expertise`=services.`servicename` INNER JOIN subservices ON services.`serviceid`=subservices.`serviceid` INNER JOIN book ON book.`subid`=subservices.`subid` INNER JOIN customer ON book.`customerid`=customer.`customerid` WHERE book.bid=?"; 
										
										PreparedStatement st=cn.prepareStatement(qry);
										st.setInt(1, bid);
										ResultSet rs=st.executeQuery();
										while(rs.next())
										{
										%>
									<select name="servicemanid">
										<option value="">Select Serviceman name</option>
										<option value="<%=rs.getString(1)%>"><%=rs.getString(2) %> <%=rs.getString(3) %></option>
										<%
										}
										%>
									</select>
									</tr>
									
									<tr>
										<td>
										<input type="hidden" name="serviceid" value="<%=serviceid%>">
										<input type="hidden" name="subid" value="<%=subid%>">
										<input type="hidden" name="bid" value="<%=bid%>">
										<input type="hidden" name="customerid" value="<%=customerid%>">
											<button type="submit" class="btn btn-primary mr-2"
															name="action" value="assign">Assign Serviceman</button>
										</td>
									</tr>
									</tbody>
								</table>
								</form>
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