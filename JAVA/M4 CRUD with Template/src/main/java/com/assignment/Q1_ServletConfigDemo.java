package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/Q1_ServletConfigDemo")
public class Q1_ServletConfigDemo extends HttpServlet {
	ServletConfig config=null;
	private static final long serialVersionUID = 1L;
    public Q1_ServletConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	this.config=config;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		out.println("Username is : "+username);
		out.println("<br>Password is : "+password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
