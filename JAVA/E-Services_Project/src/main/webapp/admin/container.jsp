<%@page import="java.sql.ResultSet"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="content-wrapper">

		<div class="row">
			<div class="col-xl-12 grid-margin stretch-card flex-column">
				<h5 class="mb-2 text-titlecase mb-4">Status of Services</h5>
				<div class="row">
<%
Connection cn=new DBUtil().getConnectionData();
String qry="SELECT COUNT(book.bid) FROM book WHERE book.bstatus='done'";
PreparedStatement st=cn.prepareStatement(qry);
ResultSet rs=st.executeQuery();
while(rs.next())
{
%>
					<div class="col-md-3 grid-margin stretch-card">
						<div class="card">
							<div class="card-body d-flex flex-column justify-content-between">
								<div
									class="d-flex justify-content-between align-items-center mb-2">
									<p class="mb-0 text-muted">Pending Services</p>
									
								</div>
								<h4><%=rs.getInt(1) %></h4>
								<canvas id="transactions-chart" class="mt-auto" height="65"></canvas>
							</div>
						</div>
					</div>
					<%} %>
<%
String qry1="SELECT COUNT(book.bid) FROM assignserviceman INNER JOIN book ON book.`bid`=assignserviceman.`bid` INNER JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` WHERE book.bstatus='assigned'";
PreparedStatement st1=cn.prepareStatement(qry1);
ResultSet rs1=st1.executeQuery();
while(rs1.next())
{
%>
					<div class="col-md-3 grid-margin stretch-card">
						<div class="card">
							<div class="card-body d-flex flex-column justify-content-between">
								<div
									class="d-flex justify-content-between align-items-center mb-2">
									<p class="mb-0 text-muted">Assigned Services</p>
									
								</div>
								<h4><%=rs1.getInt(1) %></h4>
								<canvas id="transactions-chart" class="mt-auto" height="65"></canvas>
							</div>
						</div>
					</div>
					<%} %>
<%
String qry2="SELECT COUNT(book.bid) FROM assignserviceman INNER JOIN book ON book.`bid`=assignserviceman.`bid` INNER JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` WHERE book.bstatus='confirm'";
PreparedStatement st2=cn.prepareStatement(qry2);
ResultSet rs2=st2.executeQuery();
while(rs2.next())
{
%>					
					<div class="col-md-3 grid-margin stretch-card">
						<div class="card">
							<div class="card-body d-flex flex-column justify-content-between">
								<div
									class="d-flex justify-content-between align-items-center mb-2">
									<p class="mb-0 text-muted">Confirmed Services</p>
									
								</div>
								<h4><%=rs2.getInt(1) %></h4>
								<canvas id="transactions-chart" class="mt-auto" height="65"></canvas>
							</div>
						</div>
					</div>
					<%} %>
<%
String qry3="SELECT COUNT(book.bid) FROM assignserviceman INNER JOIN book ON book.`bid`=assignserviceman.`bid` INNER JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` WHERE book.bstatus='completed'";
PreparedStatement st3=cn.prepareStatement(qry3);
ResultSet rs3=st3.executeQuery();
while(rs3.next())
{
%>						
					<div class="col-md-3 grid-margin stretch-card">
						<div class="card">
							<div class="card-body d-flex flex-column justify-content-between">
								<div
									class="d-flex justify-content-between align-items-center mb-2">
									<p class="mb-0 text-muted">Completed Services</p>
									
								</div>
								<h4><%=rs3.getInt(1) %></h4>
								<canvas id="transactions-chart" class="mt-auto" height="65"></canvas>
							</div>
						</div>
					</div>
					<%} %>
<%
String qry4="SELECT SUM(book.price) FROM book WHERE book.pstatus='successful'";
PreparedStatement st4=cn.prepareStatement(qry4);
ResultSet rs4=st4.executeQuery();
while(rs4.next())
{
%>
					<div class="col-md-3 grid-margin stretch-card">
						<div class="card">
							<div class="card-body d-flex flex-column justify-content-between">
								<div
									class="d-flex justify-content-between align-items-center mb-2">
									<p class="mb-0 text-muted">Total Income</p>
									
								</div>
								<h4><%=rs4.getString(1) %></h4>
								<canvas id="transactions-chart" class="mt-auto" height="65"></canvas>
							</div>
						</div>
					</div>
					<%} %>
				</div>
	</div>

</body>
</html>