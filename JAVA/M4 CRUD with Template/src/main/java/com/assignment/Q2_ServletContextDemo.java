package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Q2_ServletContextDemo")
public class Q2_ServletContextDemo extends HttpServlet {
	ServletContext context=null;
	private static final long serialVersionUID = 1L;
    public Q2_ServletContextDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException 
    {
    	context = config.getServletContext();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String dburl=context.getInitParameter("dburl");
		String dbusername=context.getInitParameter("dbusername");
		out.println("DBURL is : "+dburl);
		out.println("<br>DBUsername is : "+dbusername);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

}
