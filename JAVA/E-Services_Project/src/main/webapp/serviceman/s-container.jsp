<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%
int servicemanid=(int)session.getAttribute("servicemanid");
Connection cn=new DBUtil().getConnectionData();
String qry="SELECT COUNT(book.bid) FROM assignserviceman INNER JOIN book ON book.`bid`=assignserviceman.`bid` INNER JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` WHERE book.bstatus='pending' AND serviceman.servicemanid=?";
PreparedStatement st=cn.prepareStatement(qry);
st.setInt(1, servicemanid);
ResultSet rs=st.executeQuery();
while(rs.next())
{
%>
      <div class="row">
        <div class="col-xl-3 col-sm-6 mb-xl-0 mb-4">
          <div class="card">
            <div class="card-header p-3 pt-2">
              <div class="icon icon-lg icon-shape bg-gradient-dark shadow-dark text-center border-radius-xl mt-n4 position-absolute">
               <i class="material-icons opacity-10">schedule</i>
              </div>
              <div class="text-end pt-1">
                <p class="text-sm mb-0 text-capitalize">Pending Services</p>
                <h4 class="mb-0"><%=rs.getInt(1) %></h4>
              </div>
            </div>
            <hr class="dark horizontal my-0">
            <div class="card-footer p-3">
            <a href="viewpendingservices.jsp">
              <p class="mb-0"><span class="text-success text-sm font-weight-bolder">View Pending Services </span></p>
              </a>
            </div>
          </div>
        </div>
        <%} %>
        
<%
String qry1="SELECT COUNT(book.bid) FROM assignserviceman INNER JOIN book ON book.`bid`=assignserviceman.`bid` INNER JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` WHERE book.bstatus='confirm' AND serviceman.servicemanid=?";
PreparedStatement st1=cn.prepareStatement(qry1);
st1.setInt(1, servicemanid);
ResultSet rs1=st1.executeQuery();
while(rs1.next())
{
%>
        <div class="col-xl-3 col-sm-6 mb-xl-0 mb-4">
          <div class="card">
            <div class="card-header p-3 pt-2">
              <div class="icon icon-lg icon-shape bg-gradient-primary shadow-primary text-center border-radius-xl mt-n4 position-absolute">
                <i class="material-icons opacity-10">check_circle</i>
              </div>
              <div class="text-end pt-1">
                <p class="text-sm mb-0 text-capitalize">Confirmed Service</p>
                <h4 class="mb-0"><%=rs1.getInt(1) %></h4>
              </div>
            </div>
            <hr class="dark horizontal my-0">
            <div class="card-footer p-3">
            <a href="confirmedservices.jsp">
              <p class="mb-0"><span class="text-success text-sm font-weight-bolder">View Confirmed Services </span></p>
              </a>
            </div>
          </div>
        </div>
        <%} %>
<%
String qry2="SELECT COUNT(book.bid) FROM assignserviceman INNER JOIN book ON book.`bid`=assignserviceman.`bid` INNER JOIN serviceman ON serviceman.`servicemanid`=assignserviceman.`servicemanid` WHERE book.bstatus='completed' AND serviceman.servicemanid=?";
PreparedStatement st2=cn.prepareStatement(qry2);
st2.setInt(1, servicemanid);
ResultSet rs2=st2.executeQuery();
while(rs2.next())
{
%>
        <div class="col-xl-3 col-sm-6 mb-xl-0 mb-4">
          <div class="card">
            <div class="card-header p-3 pt-2">
              <div class="icon icon-lg icon-shape bg-gradient-success shadow-success text-center border-radius-xl mt-n4 position-absolute">
                <i class="material-icons opacity-10">person</i>
              </div>
              <div class="text-end pt-1">
                <p class="text-sm mb-0 text-capitalize">Completed Services</p>
                <h4 class="mb-0"><%=rs2.getInt(1) %></h4>
              </div>
            </div>
            <hr class="dark horizontal my-0">
            <div class="card-footer p-3">
            <a href="completedservices.jsp">
              <p class="mb-0"><span class="text-success text-sm font-weight-bolder">View Completed Services </span></p>
              </a>
            </div>
          </div>
        </div>
        <%} %>
<%
String qry3="SELECT SUM(rating_feedback.`rating`) FROM rating_feedback INNER JOIN serviceman ON serviceman.`servicemanid`=rating_feedback.`servicemanid` WHERE serviceman.`servicemanid`=?";
PreparedStatement st3=cn.prepareStatement(qry3);
st3.setInt(1, servicemanid);
ResultSet rs3=st3.executeQuery();
while(rs3.next())
{
%>
        <div class="col-xl-3 col-sm-6">
          <div class="card">
            <div class="card-header p-3 pt-2">
              <div class="icon icon-lg icon-shape bg-gradient-info shadow-info text-center border-radius-xl mt-n4 position-absolute">
                <i class="material-icons opacity-10">star</i>
              </div>
              <div class="text-end pt-1">
                <p class="text-sm mb-0 text-capitalize">Rating</p>
                <h4 class="mb-0"><%=rs3.getInt(1) %></h4>
              </div>
            </div>
            <hr class="dark horizontal my-0">
            <div class="card-footer p-3">
              <p class="mb-0"><span class="text-success text-sm font-weight-bolder">Good Work</span></p>
            </div>
          </div>
        </div>
      </div>
      <% } %>