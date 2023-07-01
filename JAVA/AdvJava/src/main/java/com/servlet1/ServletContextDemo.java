package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	ServletContext context = null;
	private static final long serialVersionUID = 1L;
       
    public ServletContextDemo() {
        super();
    }
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	context = config.getServletContext();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String dbUrl = context.getInitParameter("dbUrl");
		String dbusername = context.getInitParameter("dbusername");
		out.println("<h1>DBUrl is : "+dbUrl);
		out.println("<hq>Username is : "+dbusername);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
