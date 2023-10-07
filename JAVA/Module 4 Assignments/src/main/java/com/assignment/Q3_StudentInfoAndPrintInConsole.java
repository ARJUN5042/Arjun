package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Q3_StudentInfoAndPrintInConsole")
public class Q3_StudentInfoAndPrintInConsole extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Q3_StudentInfoAndPrintInConsole() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		String password=request.getParameter("password");
		
		System.out.println("First Name: "+firstname);
		System.out.println("Last Name: "+lastname);
		System.out.println("Email: "+email);
		System.out.println("Mobile: "+mobile);
		System.out.println("Gender: "+gender);
		System.out.println("Password: "+password);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
	}

}
