<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
		<div class="navbar-brand-wrapper d-flex justify-content-center">
			<div
				class="navbar-brand-inner-wrapper d-flex justify-content-between align-items-center w-100">
				<a class="navbar-brand brand-logo" href="index.html"><img
					src="images/logo.svg" alt="logo" /></a> <a
					class="navbar-brand brand-logo-mini" href="index.html"><img
					src="images/logo-mini.svg" alt="logo" /></a>
				<button class="navbar-toggler navbar-toggler align-self-center"
					type="button" data-toggle="minimize">
					<span class="typcn typcn-th-menu"></span>
				</button>
			</div>
		</div>
		<div
			class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
			<ul class="navbar-nav mr-lg-2">
				<li class="nav-item nav-profile dropdown">

					<div class="dropdown-menu dropdown-menu-right navbar-dropdown"
						aria-labelledby="profileDropdown">
						<a class="dropdown-item"> <i
							class="typcn typcn-cog-outline text-primary"></i> Settings
						</a> <a class="dropdown-item"> <i
							class="typcn typcn-eject text-primary"></i> Logout
						</a>
					</div>
				</li>

			</ul>
			<ul class="navbar-nav navbar-nav-right">
			<li class="nav-item nav-profile dropdown">
			<div class="dropdown-menu dropdown-menu-right navbar-dropdown"
						aria-labelledby="profileDropdown">
			<form method="post" action="logout.jsp"	class="forms-sample">
				<button type="submit" class="btn btn-primary mr-2"
				name="action">Log out</button>
			</form>
			</div>
			</li>
			</ul>
			
		</div>
	</nav>
	<!-- partial -->
	<nav class="navbar-breadcrumb col-xl-12 col-12 d-flex flex-row p-0">

		<div
			class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
			<ul class="navbar-nav mr-lg-2">
				<li class="nav-item ml-0">
					<h4 class="mb-0">Dashboard</h4>
				</li>
				<li class="nav-item">
					<div class="d-flex align-items-baseline">
						<p class="mb-0">Home</p>
						<i class="typcn typcn-chevron-right"></i>
						<p class="mb-0">Main Dahboard</p>
					</div>
				</li>
			</ul>
			<ul class="navbar-nav navbar-nav-right">
				<li class="nav-item nav-search d-none d-md-block mr-0">
				</li>
			</ul>
		</div>
	</nav>
</body>
</html>