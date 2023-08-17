<%@page import="com.model.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ST-Home</title>
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
th, td{
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
	<h2>Student Details</h2>
	<div class="table1">
		<table border=1px>
		<tr>
			<th>Sid</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Gender</th>
			<th>Password</th>
			<th colspan="2">Action</th>
			
		</tr>	
		<tr>
			<td>${hmodel.sid }</td>
			<td>${hmodel.fname }</td>
			<td>${hmodel.lname }</td>
			<td>${hmodel.email }</td>
			<td>${hmodel.mobile }</td>
			<td>${hmodel.gender }</td>
			<td>${hmodel.password }</td>
			<td><a href="HomeController.do?action=edituser&sid=${hmodel.sid }">Edit</a></td>
			<td><a href="HomeController.do?action=deleteuser&sid=${hmodel.sid }">Delete</a></td>
		</tr>
		</table>
	</div>
	<br><br>
	
	<c:if test="${homemodel.sid>0 }">
	<form method="post" action="HomeController.do">
<table>
<tr>
	<td>First Name : </td>
	<td><input type="text" name="fname" value="${homemodel.fname }"/></td>
</tr>
<tr>
	<td>Last Name : </td>
	<td><input type="text" name="lname" value="${homemodel.lname }"/></td>
</tr>
<tr>
	<td>Email : </td>
	<td><input type="text" name="email"  value="${homemodel.email }"/></td>
</tr>
<tr>
	<td>Mobile : </td>
	<td><input type="text" name="mobile" value="${homemodel.mobile }"/></td>
</tr>
<tr>
	<td>Gender : </td>
	<td>
	<input type="radio" name="gender" value="${homemodel.gender }">Male
	<input type="radio" name="gender" value="${homemodel.gender }">Female
	</td>
	
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password"  value="${homemodel.password }"/>
	<input type="hidden" name="sid" value="${homemodel.sid }"/></td>
</tr>
<tr>
	<td><input type="submit" name="action" value="Update"/></td>
</tr>
</table>
</form>
</c:if>
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