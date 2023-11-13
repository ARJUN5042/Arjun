<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Product Section Begin -->
    <section class="product spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <ul class="filter__controls">
                        <li class="active" data-filter="*">Our Services</li>
                        
                    </ul>
                </div>
            </div>
            <div class="row product__filter">
            <%
            Connection cn=new DBUtil().getConnectionData();
                        String qry="select * from services";
                        PreparedStatement st=cn.prepareStatement(qry);
                        ResultSet rs=st.executeQuery();
                        while(rs.next())
                        {
            %>
           
                <div class="col-lg-3 col-md-6 col-sm-6 col-md-6 col-sm-6 mix new-arrivals">
                    <div class="product__item">
                        <div class="product__item__pic set-bg" data-setbg="uploadimage/<%=rs.getString(3)%>">                            
                        </div>
                        <div>
                            <h4><%=rs.getString(2) %></h4>
                            </div>
                    </div>
                </div>
                <%
                }
                cn.close();
                %>
            </div>
        </div>
    </section>