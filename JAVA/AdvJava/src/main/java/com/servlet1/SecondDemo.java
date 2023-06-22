package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/SecondDemo")//creating by edit in web.xml code
public class SecondDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SecondDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");//encoding from text to html
		PrintWriter out=response.getWriter();
		out.println("<h1 align='center' style='color:red'>Welcome to Servlet...</h1>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

}
