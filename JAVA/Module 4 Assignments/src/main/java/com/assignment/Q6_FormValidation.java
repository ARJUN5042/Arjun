package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q6_FormValidation")
public class Q6_FormValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Q6_FormValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(firstname.isEmpty() || lastname.isEmpty() || mobile.isEmpty() || email.isEmpty() || password.isEmpty())
		{
			out.println("<h2>All fields are required.</h2>");
			return;
		}
		if(password.length()<6)
		{
			out.println("<h2>Password must be atlest 6 characters long</h2>");
			return;
		}
		if(!mobile.matches("\\d+"))
		{
			out.println("<h2>Mobile Number must be a number.</h2>");
			return;
		}
		
		out.println("<h2>Registration Successful</h2>");
		out.println("<p>Firstname : "+firstname+"</p>");
		out.println("<p>Lastname : "+lastname+"</p>");
		out.println("<p>Mobile No. : "+mobile+"</p>");
		out.println("<p>Email : "+email+"</p>");
		out.println("<p>Password : "+password+"</p>");
	}

}
