<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="apple-touch-icon" sizes="76x76"
	href="./assets/img/apple-icon.png">
<link rel="icon" type="image/png" href="./assets/img/favicon.png">
<title>Home Page</title>
<!--     Fonts and icons     -->
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900|Roboto+Slab:400,700" />
<!-- Nucleo Icons -->
<link href="./assets/css/nucleo-icons.css" rel="stylesheet" />
<link href="./assets/css/nucleo-svg.css" rel="stylesheet" />
<!-- Font Awesome Icons -->
<script src="https://kit.fontawesome.com/42d5adcbca.js"
	crossorigin="anonymous"></script>
<!-- Material Icons -->
<link
	href="https://fonts.googleapis.com/icon?family=Material+Icons+Round"
	rel="stylesheet">
<!-- CSS Files -->
<link id="pagestyle" href="./assets/css/material-dashboard.css?v=3.0.0"
	rel="stylesheet" />
<style>
::-webkit-scrollbar {
	width: 6px;
}

/* Track */
::-webkit-scrollbar-track {
	background: #aaa;
}

/* Handle */
::-webkit-scrollbar-thumb {
	background: #888;
}

.ps__thumb-y {
	background-color: #aaa;
	border-radius: 6px;
	transition: background-color .2s linear, width .2s ease-in-out;
	width: 6px;
	right: 2px;
	position: absolute;
}


</style>
</head>

<body class="g-sidenav-show  bg-gray-200">

<aside class="sidenav navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-3   bg-gradient-dark" id="sidenav-main">
    <%@include file="s-sidebar.jsp" %>
  </aside>
  
  
  <main class="main-content position-relative max-height-vh-100 h-100 border-radius-lg ">
   <%@include file="s-header.jsp" %>
   
   <div class="container-fluid py-4">
   
   <div class="row">
        <div class="col-12">
          <div class="card my-4">
            <div class="card-header p-0 position-relative mt-n4 mx-3 z-index-2">
              <div class="bg-gradient-primary shadow-primary border-radius-lg pt-4 pb-3">
                <h6 class="text-white text-capitalize ps-3">Pending Services</h6>
              </div>
            </div>
            <div class="card-body px-0 pb-2">
              <div class="table-responsive p-0">
                <table class="table align-items-center mb-0">
                  <thead>
                    <tr>
                      <th class="text-secondary text-x  font-weight-bolder opacity-7 ps-2">Book Id</th>
                      <th class="text-secondary text-x font-weight-bolder opacity-7 ps-2">Customer Id</th>
                      <th class="text-secondary text-x font-weight-bolder opacity-7 ps-2">Customer Name</th>
                      <th class="text-secondary text-x font-weight-bolder opacity-7 ps-2">Sub Service Name</th>
                      <th class="text-secondary text-x font-weight-bolder opacity-7 ps-2">Booking Date</th>
                      <th class="text-secondary text-x font-weight-bolder opacity-7 ps-2">Book Status</th>
                      <th class="text-secondary text-x font-weight-bolder opacity-7 ps-2" colspan="2" style="text-align:center;">Action</th>
                    </tr>
                  </thead>
                  <tbody>
                  <%
                  int servicemanid=(Integer)session.getAttribute("servicemanid");
                  Connection cn=new DBUtil().getConnectionData();
                  String qry="SELECT book.bid,customer.`customerid`,customer.`firstname`,subservices.`subsname`,book.`bdate`,book.`bstatus`,serviceman.`servicemanid`,serviceman.`expertise` FROM assignserviceman JOIN book ON book.`bid`=assignserviceman.`bid` JOIN customer ON customer.`customerid`=assignserviceman.`customerid` JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` JOIN services ON services.`serviceid`=assignserviceman.`serviceid` JOIN subservices ON subservices.`subid`=assignserviceman.`subid` WHERE book.bstatus='assigned' AND serviceman.`servicemanid`=?";
                  PreparedStatement st = cn.prepareStatement(qry);
                  st.setInt(1, servicemanid);
				  ResultSet rs = st.executeQuery();
				  while(rs.next())
				  {
                  %>
                    <tr>
                      <td>
                        <div class="d-flex px-2 py-1">
                          <div class="d-flex flex-column justify-content-center">
                            <p class="text-xs text-secondary mb-0"><%=rs.getInt(1) %></p>
                          </div>
                        </div>
                      </td>
                      <td>
                        <div class="d-flex px-2 py-1">
                          <div class="d-flex flex-column justify-content-center">
                            <p class="text-xs text-secondary mb-0"><%=rs.getInt(2) %></p>
                          </div>
                        </div>
                      </td>
                      <td class="align-middle text-center text-sm">
                        <div class="d-flex px-2 py-1">
                          <div class="d-flex flex-column justify-content-center">
                            <p class="text-xs text-secondary mb-0"><%=rs.getString(3) %></p>
                          </div>
                        </div>
                      </td>
                      <td class="align-middle text-center">
                        <div class="d-flex px-2 py-1">
                          <div class="d-flex flex-column justify-content-center">
                            <p class="text-xs text-secondary mb-0"><%=rs.getString(4) %></p>
                          </div>
                        </div>
                      </td>
                      <td class="align-middle text-center">
                        <div class="d-flex px-2 py-1">
                          <div class="d-flex flex-column justify-content-center">
                            <p class="text-xs text-secondary mb-0"><%=rs.getString(5) %></p>
                          </div>
                        </div>
                      </td>
                      <td class="align-middle text-center">
                        <div class="d-flex px-2 py-1">
                          <div class="d-flex flex-column justify-content-center">
                            <p class="text-xs text-secondary mb-0"><%=rs.getString(6) %></p>
                          </div>
                        </div>
                      </td>
                      <td class="align-middle">
    <form method="post" action="../ServicemanController">
        <input type="hidden" name="action" value="confirmservice">
        <input type="hidden" name="bid" value="<%=rs.getString(1)%>">
        <button type="submit" class="btn-link text-secondary font-weight-bold text-xs" style="border:none; border-radius:15px; padding:0;">
            <span class="badge badge-sm bg-gradient-success">Confirm</span>
        </button>
    </form>
</td>
<td class="align-middle">
    <form method="post" action="../ServicemanController">
     <input type="hidden" name="action" value="rejectservice">
     <input type="hidden" name="bid" value="<%=rs.getString(1)%>">
        <button type="submit" class="btn-link text-secondary font-weight-bold text-xs" style="border:none; border-radius:15px; padding:0;">
            <span class="badge badge-sm bg-gradient-secondary">Reject</span>
        </button>   
    </form>
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
      </div>
   
   
   
   
   
     <%@include file="footer.jsp" %>
   </div>
  </main>

			





	<div class="fixed-plugin">
		<a class="fixed-plugin-button text-dark position-fixed px-3 py-2">
			<i class="material-icons py-2">settings</i>
		</a>
		<div class="card shadow-lg">
			<div class="card-header pb-0 pt-3">
				<div class="float-start">
					<h5 class="mt-3 mb-0">Material UI Configurator</h5>
					<p>See our dashboard options.</p>
				</div>
				<div class="float-end mt-4">
					<button
						class="btn btn-link text-dark p-0 fixed-plugin-close-button">
						<i class="material-icons">clear</i>
					</button>
				</div>
				<!-- End Toggle Button -->
			</div>
			<hr class="horizontal dark my-1">
			<div class="card-body pt-sm-3 pt-0">
				<!-- Sidebar Backgrounds -->
				<div>
					<h6 class="mb-0">Sidebar Colors</h6>
				</div>
				<a href="javascript:void(0)" class="switch-trigger background-color">
					<div class="badge-colors my-2 text-start">
						<span class="badge filter bg-gradient-primary active"
							data-color="primary" onclick="sidebarColor(this)"></span> <span
							class="badge filter bg-gradient-dark" data-color="dark"
							onclick="sidebarColor(this)"></span> <span
							class="badge filter bg-gradient-info" data-color="info"
							onclick="sidebarColor(this)"></span> <span
							class="badge filter bg-gradient-success" data-color="success"
							onclick="sidebarColor(this)"></span> <span
							class="badge filter bg-gradient-warning" data-color="warning"
							onclick="sidebarColor(this)"></span> <span
							class="badge filter bg-gradient-danger" data-color="danger"
							onclick="sidebarColor(this)"></span>
					</div>
				</a>
				<!-- Sidenav Type -->
				<div class="mt-3">
					<h6 class="mb-0">Sidenav Type</h6>
					<p class="text-sm">Choose between 2 different sidenav types.</p>
				</div>
				<div class="d-flex">
					<button class="btn bg-gradient-dark px-3 mb-2 active"
						data-class="bg-gradient-dark" onclick="sidebarType(this)">Dark</button>
					<button class="btn bg-gradient-dark px-3 mb-2 ms-2"
						data-class="bg-transparent" onclick="sidebarType(this)">Transparent</button>
					<button class="btn bg-gradient-dark px-3 mb-2 ms-2"
						data-class="bg-white" onclick="sidebarType(this)">White</button>
				</div>
				<p class="text-sm d-xl-none d-block mt-2">You can change the
					sidenav type just on desktop view.</p>
				<!-- Navbar Fixed -->
				<div class="mt-3 d-flex">
					<h6 class="mb-0">Navbar Fixed</h6>
					<div class="form-check form-switch ps-0 ms-auto my-auto">
						<input class="form-check-input mt-1 ms-auto" type="checkbox"
							id="navbarFixed" onclick="navbarFixed(this)">
					</div>
				</div>
				<hr class="horizontal dark my-3">
				<div class="mt-2 d-flex">
					<h6 class="mb-0">Light / Dark</h6>
					<div class="form-check form-switch ps-0 ms-auto my-auto">
						<input class="form-check-input mt-1 ms-auto" type="checkbox"
							id="dark-version" onclick="darkMode(this)">
					</div>
				</div>
				<hr class="horizontal dark my-sm-4">
				<a class="btn btn-outline-dark w-100" href="">View documentation</a>
				<div class="w-100 text-center">
					<a class="github-button"
						href="https://github.com/creativetimofficial/material-dashboard"
						data-icon="octicon-star" data-size="large" data-show-count="true"
						aria-label="Star creativetimofficial/material-dashboard on GitHub">Star</a>
					<h6 class="mt-3">Thank you for sharing!</h6>
					<a
						href="https://twitter.com/intent/tweet?text=Check%20Material%20UI%20Dashboard%20made%20by%20%40CreativeTim%20%23webdesign%20%23dashboard%20%23bootstrap5&amp;url=https%3A%2F%2Fwww.creative-tim.com%2Fproduct%2Fsoft-ui-dashboard"
						class="btn btn-dark mb-0 me-2" target="_blank"> <i
						class="fab fa-twitter me-1" aria-hidden="true"></i> Tweet
					</a> <a
						href="https://www.facebook.com/sharer/sharer.php?u=https://www.creative-tim.com/product/material-dashboard"
						class="btn btn-dark mb-0 me-2" target="_blank"> <i
						class="fab fa-facebook-square me-1" aria-hidden="true"></i> Share
					</a>
				</div>
			</div>
		</div>
	</div>
	<!--   Core JS Files   -->
	<script src="./assets/js/core/popper.min.js"></script>
	<script src="./assets/js/core/bootstrap.min.js"></script>
	<script src="./assets/js/plugins/perfect-scrollbar.min.js"></script>
	<script src="./assets/js/plugins/smooth-scrollbar.min.js"></script>
	<script src="./assets/js/plugins/chartjs.min.js"></script>
	<script>
		var ctx = document.getElementById("chart-bars").getContext("2d");

		new Chart(ctx, {
			type : "bar",
			data : {
				labels : [ "M", "T", "W", "T", "F", "S", "S" ],
				datasets : [ {
					label : "Sales",
					tension : 0.4,
					borderWidth : 0,
					borderRadius : 4,
					borderSkipped : false,
					backgroundColor : "rgba(255, 255, 255, .8)",
					data : [ 50, 20, 10, 22, 50, 10, 40 ],
					maxBarThickness : 6
				}, ],
			},
			options : {
				responsive : true,
				maintainAspectRatio : false,
				plugins : {
					legend : {
						display : false,
					}
				},
				interaction : {
					intersect : false,
					mode : 'index',
				},
				scales : {
					y : {
						grid : {
							drawBorder : false,
							display : true,
							drawOnChartArea : true,
							drawTicks : false,
							borderDash : [ 5, 5 ],
							color : 'rgba(255, 255, 255, .2)'
						},
						ticks : {
							suggestedMin : 0,
							suggestedMax : 500,
							beginAtZero : true,
							padding : 10,
							font : {
								size : 14,
								weight : 300,
								family : "Roboto",
								style : 'normal',
								lineHeight : 2
							},
							color : "#fff"
						},
					},
					x : {
						grid : {
							drawBorder : false,
							display : true,
							drawOnChartArea : true,
							drawTicks : false,
							borderDash : [ 5, 5 ],
							color : 'rgba(255, 255, 255, .2)'
						},
						ticks : {
							display : true,
							color : '#f8f9fa',
							padding : 10,
							font : {
								size : 14,
								weight : 300,
								family : "Roboto",
								style : 'normal',
								lineHeight : 2
							},
						}
					},
				},
			},
		});

		var ctx2 = document.getElementById("chart-line").getContext("2d");

		new Chart(ctx2, {
			type : "line",
			data : {
				labels : [ "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
						"Nov", "Dec" ],
				datasets : [ {
					label : "Mobile apps",
					tension : 0,
					borderWidth : 0,
					pointRadius : 5,
					pointBackgroundColor : "rgba(255, 255, 255, .8)",
					pointBorderColor : "transparent",
					borderColor : "rgba(255, 255, 255, .8)",
					borderColor : "rgba(255, 255, 255, .8)",
					borderWidth : 4,
					backgroundColor : "transparent",
					fill : true,
					data : [ 50, 40, 300, 320, 500, 350, 200, 230, 500 ],
					maxBarThickness : 6

				} ],
			},
			options : {
				responsive : true,
				maintainAspectRatio : false,
				plugins : {
					legend : {
						display : false,
					}
				},
				interaction : {
					intersect : false,
					mode : 'index',
				},
				scales : {
					y : {
						grid : {
							drawBorder : false,
							display : true,
							drawOnChartArea : true,
							drawTicks : false,
							borderDash : [ 5, 5 ],
							color : 'rgba(255, 255, 255, .2)'
						},
						ticks : {
							display : true,
							color : '#f8f9fa',
							padding : 10,
							font : {
								size : 14,
								weight : 300,
								family : "Roboto",
								style : 'normal',
								lineHeight : 2
							},
						}
					},
					x : {
						grid : {
							drawBorder : false,
							display : false,
							drawOnChartArea : false,
							drawTicks : false,
							borderDash : [ 5, 5 ]
						},
						ticks : {
							display : true,
							color : '#f8f9fa',
							padding : 10,
							font : {
								size : 14,
								weight : 300,
								family : "Roboto",
								style : 'normal',
								lineHeight : 2
							},
						}
					},
				},
			},
		});

		var ctx3 = document.getElementById("chart-line-tasks").getContext("2d");

		new Chart(ctx3, {
			type : "line",
			data : {
				labels : [ "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
						"Nov", "Dec" ],
				datasets : [ {
					label : "Mobile apps",
					tension : 0,
					borderWidth : 0,
					pointRadius : 5,
					pointBackgroundColor : "rgba(255, 255, 255, .8)",
					pointBorderColor : "transparent",
					borderColor : "rgba(255, 255, 255, .8)",
					borderWidth : 4,
					backgroundColor : "transparent",
					fill : true,
					data : [ 50, 40, 300, 220, 500, 250, 400, 230, 500 ],
					maxBarThickness : 6

				} ],
			},
			options : {
				responsive : true,
				maintainAspectRatio : false,
				plugins : {
					legend : {
						display : false,
					}
				},
				interaction : {
					intersect : false,
					mode : 'index',
				},
				scales : {
					y : {
						grid : {
							drawBorder : false,
							display : true,
							drawOnChartArea : true,
							drawTicks : false,
							borderDash : [ 5, 5 ],
							color : 'rgba(255, 255, 255, .2)'
						},
						ticks : {
							display : true,
							padding : 10,
							color : '#f8f9fa',
							font : {
								size : 14,
								weight : 300,
								family : "Roboto",
								style : 'normal',
								lineHeight : 2
							},
						}
					},
					x : {
						grid : {
							drawBorder : false,
							display : false,
							drawOnChartArea : false,
							drawTicks : false,
							borderDash : [ 5, 5 ]
						},
						ticks : {
							display : true,
							color : '#f8f9fa',
							padding : 10,
							font : {
								size : 14,
								weight : 300,
								family : "Roboto",
								style : 'normal',
								lineHeight : 2
							},
						}
					},
				},
			},
		});
	</script>
	<script>
		var win = navigator.platform.indexOf('Win') > -1;
		if (win && document.querySelector('#sidenav-scrollbar')) {
			var options = {
				damping : '0.5'
			}
			Scrollbar.init(document.querySelector('#sidenav-scrollbar'),
					options);
		}
	</script>
	<!-- Github buttons -->
	<script async defer src="https://buttons.github.io/buttons.js"></script>
</body>
</html>
