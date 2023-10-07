<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login Page</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- Favicon -->
<link href="img/favicon.ico" rel="icon">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap"
	rel="stylesheet">

<!-- Icon Font Stylesheet -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">

<!-- Libraries Stylesheet -->
<link href="lib/animate/animate.min.css" rel="stylesheet">
<link href="lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">

<!-- Customized Bootstrap Stylesheet -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Template Stylesheet -->
<link href="css/style.css" rel="stylesheet">

<style>
h2 {
	text-align: center;
}

span {
	color: red;
}
.table1{
display: flex;
justify-content: center;
}
.table1 .maindiv td{
margin: 10px;
padding: 10px;
}
table tr td{
padding: 10px;
}
.a{
color: red;
text-decoration: underline;
}
</style>
</head>
<body>
	<%@include file="header.jsp"%>
	<br><br>
	${msg }
	<h2>Registration Details</h2>
	<div class="table1">
		<table>
			<form method="post" action="RegisterController.do">
				
				<div class="maindiv">
					<tr>
						<td>
							<p>
								Email<span>*</span>
							</p>
						</td>
						<td><input type="text" name="email"
							placeholder="Enter Email Id"></td>
						<td>
							<p>
								Password<span>*</span>
							</p>
						</td>
						<td><input type="password" name="password"
							placeholder="Enter Password"></td>
				</div>
				
				<div class="maindiv">
					<tr>
						<td colspan="4" align="center">
							<p>
								<button type="submit" name="action" value="login">Login</button>
							</p>
						</td>
					</tr>
				</div>

			</form>
		</table>
	</div>

	<%@include file="footer.jsp"%>




	<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i
		class="bi bi-arrow-up"></i></a>


	<!-- JavaScript Libraries -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="lib/wow/wow.min.js"></script>
	<script src="lib/easing/easing.min.js"></script>
	<script src="lib/waypoints/waypoints.min.js"></script>
	<script src="lib/owlcarousel/owl.carousel.min.js"></script>

	<!-- Template Javascript -->
	<script src="js/main.js"></script>
</body>
</html>