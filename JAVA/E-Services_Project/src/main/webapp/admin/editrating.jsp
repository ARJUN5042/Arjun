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
<title>Rating-FeedBack</title>
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

.rating {
	unicode-bidi: bidi-override;
	direction: rtl;
	text-align: center;
}

.rating>span {
	display: inline-block;
	position: relative;
	width: 1.1em;
	cursor: pointer;
	font-size: 2em;
	color: #ccc;
}

.rating>span:before {
	content: "\2605";
	position: absolute;
	color: #ccc;
}

.rating>span:hover:before, .rating>span.selected:before {
	color: gold;
}

.selected {
	color: gold;
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
							<h4 class="card-title">Rating-Feedback</h4>
							<div class="table-responsive">
							<form method="post" action="../AdminController">
								<table class="table" cellpadding="10">
									<thead>
										<tr>
											<th>Rating</th>
											<th>Feedback</th>

											<th colspan="2">Action</th>
										</tr>
									</thead>
									<tbody>
										<%
										int bid = Integer.parseInt(request.getParameter("bid"));
										Connection cn = new DBUtil().getConnectionData();
										String qry = "SELECT * FROM rating_feedback WHERE bid=?";
										PreparedStatement st = cn.prepareStatement(qry);
										st.setInt(1, bid);
										ResultSet rs = st.executeQuery();
										while (rs.next()) {
										%>
										<tr>
											<td>
												<div class="d-flex px-2 py-1">
													<div class="d-flex flex-column justify-content-center">
														
															<div class="rating">
																<span class="star" data-value="5">&#9733;</span> 
																<span class="star" data-value="4">&#9733;</span> 
																<span class="star" data-value="3">&#9733;</span> 
																<span class="star" data-value="2">&#9733;</span> 
																<span class="star" data-value="1">&#9733;</span> 
																<input type="hidden" name="rating" id="rating" value="<%=rs.getInt(8)%>">
										
														</div>
													</div>
												</div>
											</td>
											<td>
											<input type="text" name="feedback" value="<%=rs.getString(9) %>" required></textarea>
											</td>

											<td>
												<div class="col-md-6 grid-margin stretch-card">

													<div class="col-md-6 grid-margin stretch-card">
														<input type="hidden" name="bid" value="<%=bid%> ">
														<input type="submit" name="action" class="btn btn-light" value="Update Rating">
											</td>
													</div>
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
	<script>
        // Add JavaScript to handle star rating selection
        const stars = document.querySelectorAll('.star');
        const ratingInput = document.getElementById('rating');

        stars.forEach(star => {
            star.addEventListener('click', () => {
                const ratingValue = star.getAttribute('data-value');
                ratingInput.value = ratingValue;
                
                // Add 'selected' class to the clicked star and all previous stars
                stars.forEach(s => {
                    if (parseInt(s.getAttribute('data-value')) <= parseInt(ratingValue)) {
                        s.classList.add('selected');
                    } else {
                        s.classList.remove('selected');
                    }
                });
            });
        });
    </script>

	<!-- End custom js for this page-->
</body>
</html>