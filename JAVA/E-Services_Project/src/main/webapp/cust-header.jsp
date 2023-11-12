<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <!-- Header Section Begin -->
    <header class="header">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3">
                    <div class="header__logo">
                        <a href="./index.html"><img src="img/logo.png" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <nav class="header__menu mobile-menu">
                        <ul>
                            <li class="active"><a href="cust-home.jsp">Home</a></li>
                            <li><a href="./shop.html">Shop</a></li>
                            <li><a href="./blog.html">Blog</a></li>
                            <li><a href="./contact.html">Contacts</a></li>
                            <li><a href="#"><%=session.getAttribute("firstname")+" "+session.getAttribute("lastname") %></a>
                                <ul class="dropdown">
                                    <li><a href="viewprofile.jsp?customerid=<%=session.getAttribute("customerid") %>">View Profile</a></li>
                                    <li><a href="viewbookedservices.jsp?customerid=<%=session.getAttribute("customerid") %>">View Booked Services</a></li>
                                    <li><a href="viewconfirmedservices.jsp?customerid=<%=session.getAttribute("customerid") %>">View Confirmed Services</a></li>
                                    <li><a href="viewcompletedservices.jsp?customerid=<%=session.getAttribute("customerid") %>">View Completed Services</a></li>
                                    <li><a href="logout.jsp">Logout</a></li>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                </div>
                <div class="col-lg-3 col-md-3">
                    <div class="header__nav__option">
                        <a href="#" class="search-switch"><img src="img/icon/search.png" alt=""></a>
                        <a href="#"><img src="img/icon/heart.png" alt=""></a>
                        <a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
                        <div class="price">$0.00</div>
                    </div>
                </div>
            </div>
            <div class="canvas__open"><i class="fa fa-bars"></i></div>
        </div>
    </header>
    <!-- Header Section End -->
</body>
</html>