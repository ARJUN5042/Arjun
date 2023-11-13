<%@ page import="com.model.SubServiceModel"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="com.util.DBUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Male_Fashion Template">
    <meta name="keywords" content="Male_Fashion, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Feedback</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
     
<style>
    .rating {
        unicode-bidi: bidi-override;
        direction: rtl;
        text-align: center;
    }

    .rating > span {
        display: inline-block;
        position: relative;
        width: 1.1em;
        cursor: pointer;
        font-size: 2em;
        color: #ccc;
    }

    .rating > span:before {
        content: "\2605";
        position: absolute;
        color: #ccc;
    }

    .rating > span:hover:before,
    .rating > span.selected:before {
        color: gold;
    }

    .selected {
        color: gold;
    }
</style>


</head>
<body>
	<%@ include file="cust-header.jsp"%>

	<!-- Shopping Cart Section Begin -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="shopping__cart__table">
					<form action="CustomerController" method="post">
						<table>
							<thead>
								<tr>
									<th>Book Id</th>
									<th>Sub Service Image</th>
									<th>Sub Service Name</th>
									<th>Book Date</th>
									<th>Serviceman Name</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<%
									int bid = Integer.parseInt(request.getParameter("bid"));
									int customerid = Integer.parseInt(request.getParameter("customerid"));
									int serviceid = Integer.parseInt(request.getParameter("serviceid"));
									int subid = Integer.parseInt(request.getParameter("subid"));
									int servicemanid = Integer.parseInt(request.getParameter("servicemanid"));
									Connection cn = new DBUtil().getConnectionData();
									String qry = "SELECT book.bid,subservices.`image`,subservices.`subsname`,book.`bdate`,serviceman.`firstname`,serviceman.`lastname`,assignserviceman.assignid FROM assignserviceman INNER JOIN book ON book.`bid`=assignserviceman.`bid` INNER JOIN services ON services.`serviceid`=assignserviceman.`serviceid` INNER JOIN subservices ON subservices.`subid`=assignserviceman.`subid` INNER JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` INNER JOIN customer ON customer.`customerid`=assignserviceman.`customerid` WHERE book.`bid`=? AND customer.customerid=? AND services.serviceid=? AND subservices.subid=? AND serviceman.servicemanid=?";
									PreparedStatement st = cn.prepareStatement(qry);
									st.setInt(1, bid);
									st.setInt(2, customerid);
									st.setInt(3, serviceid);
									st.setInt(4, subid);
									st.setInt(5, servicemanid);
									ResultSet rs = st.executeQuery();
									while (rs.next()) {
									%>
									<td>
										<h6><%=rs.getInt(1)%></h6>
									</td>
									<td>
										<div class="product__item__pic set-bg"
											data-setbg="uploadimage/<%=rs.getString(2)%>"
											style="width: 150px; height: 150px;"></div>
									</td>
									<td>
										<h6><%=rs.getString(3)%></h6>
									</td>
									<td>
										<h6><%=rs.getString(4)%></h6>
									</td>
									<td>
										<h6><%=rs.getString(5)%>
											<%=rs.getString(6)%></h6>
									</td>
								</tr>
								<tr>
									<td colspan="5">
									<label for="rating" style="text-align:center;">Rating:</label>
										<div class="rating">
											<span class="star" data-value="5">&#9733;</span> 
											<span class="star" data-value="4">&#9733;</span> 
											<span class="star" data-value="3">&#9733;</span> 
											<span class="star" data-value="2">&#9733;</span> 
											<span class="star" data-value="1">&#9733;</span> 
											<input type="hidden" name="rating" id="rating" value="5">
										</div>
									</td>
								</tr>
								<tr>
									<td colspan="5">
									<label for="feedback">Feedback:</label> 
									<textarea name="feedback" rows="3" cols="30" required>
									</textarea>
									</td>
								</tr>
								<tr>
									<input type="hidden" name="customerid" value="<%=customerid %>">
									<input type="hidden" name="bid" value="<%=bid%> ">
									<input type="hidden" name="subid" value="<%=subid%> ">
									<input type="hidden" name="serviceid" value="<%=serviceid %>">
									<input type="hidden" name="servicemanid" value="<%=servicemanid %>">
									<input type="hidden" name="assignid" value="<%=rs.getInt(7) %>">

									<td colspan="5">
									<input type="submit" name="action" class="site-btn" value="Submit Feedback"></td>
								</tr>
								<%
								}
								cn.close();
								%>
							</tbody>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- </section> -->
	<!-- Shopping Cart Section End -->




	<%@ include file="footer.jsp"%>

	<!-- Search Begin -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">+</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search End -->

	<!-- Js Plugins -->
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/jquery.countdown.min.js"></script>
	<script src="js/jquery.slicknav.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>
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
</body>
</html>