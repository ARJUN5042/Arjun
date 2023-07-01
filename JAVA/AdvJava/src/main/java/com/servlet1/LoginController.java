package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.equals("rahul") && password.equals("rahul"))
		{
			request.setAttribute("username", username);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else
		{
//			request.setAttribute("msg", "Invalid Username or Password");
//			request.getRequestDispatcher("error.jsp").forward(request, response);
			response.sendRedirect("error.jsp?msg=invalid username or password");
		}
	}

}
