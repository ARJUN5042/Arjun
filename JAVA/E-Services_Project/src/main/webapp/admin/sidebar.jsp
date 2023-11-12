<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<nav class="sidebar sidebar-offcanvas" id="sidebar">
		<ul class="nav">
			<li class="nav-item"><a class="nav-link" href="dashboard.jsp">
					<i class="typcn typcn-device-desktop menu-icon"></i> <span
					class="menu-title">Dashboard</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" data-toggle="collapse"
				href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
					<i class="typcn typcn-document-text menu-icon"></i> <span
					class="menu-title">Services</span> <i class="menu-arrow"></i>
			</a>
				<div class="collapse" id="ui-basic">
					<ul class="nav flex-column sub-menu">
						<li class="nav-item"><a class="nav-link"
							href="addservices.jsp">Add Main Services</a></li>
						<li class="nav-item"><a class="nav-link"
							href="subservices.jsp">Add Sub Services</a></li>
						<li class="nav-item"><a class="nav-link"
							href="viewmainservices.jsp">View Main Services</a></li>
						<li class="nav-item"><a class="nav-link"
							href="viewsubservices.jsp">View Sub Services</a></li>
					</ul>
				</div></li>
			
			<li class="nav-item"><a class="nav-link" data-toggle="collapse"
				href="#form-elements" aria-expanded="false"
				aria-controls="form-elements"> <i
					class="typcn typcn-film menu-icon"></i> <span class="menu-title">Booked Services</span> <i class="menu-arrow"></i>
			</a>
				<div class="collapse" id="form-elements">
					<ul class="nav flex-column sub-menu">
						<li class="nav-item"><a class="nav-link"
							href="viewpendingservices.jsp">View Pending Services</a></li>
					</ul>
				</div>
				<div class="collapse" id="form-elements">
					<ul class="nav flex-column sub-menu">
						<li class="nav-item"><a class="nav-link"
							href="viewassignedservices.jsp">View Assigned Services</a></li>
					</ul>
				</div>
				<div class="collapse" id="form-elements">
					<ul class="nav flex-column sub-menu">
						<li class="nav-item"><a class="nav-link"
							href="viewconfirmservices.jsp">View Confirmed Services</a></li>
					</ul>
				</div>
				<div class="collapse" id="form-elements">
					<ul class="nav flex-column sub-menu">
						<li class="nav-item"><a class="nav-link"
							href="viewcompletedservices.jsp">View Completed Services</a></li>
					</ul>
				</div>
				</li>
			
			<li class="nav-item">
			<a class="nav-link" href="logout.jsp">
				<i class="typcn typcn-mortar-board menu-icon"></i> 
				<span class="menu-title">Logout</span>
			</a></li>
		</ul>
	</nav>
</body>
</html>