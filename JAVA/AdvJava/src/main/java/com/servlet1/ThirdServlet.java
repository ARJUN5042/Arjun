package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		String name=request.getParameter("name");
//		out.println("<h1> My Name is ... "+name);
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		int no1=Integer.parseInt(request.getParameter("no1"));
//		int no2=Integer.parseInt(request.getParameter("no2"));
//		out.println("<h1>Sum is..."+(no1+no2));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int no1=Integer.parseInt(request.getParameter("no1"));
		int no2=Integer.parseInt(request.getParameter("no2"));
		out.println("<h1>Sum is..."+(no1+no2));
	}

}
