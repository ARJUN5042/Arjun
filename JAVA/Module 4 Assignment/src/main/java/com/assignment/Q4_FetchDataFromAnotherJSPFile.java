package com.assignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q4_FetchDataFromAnotherJSPFile")
public class Q4_FetchDataFromAnotherJSPFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Q4_FetchDataFromAnotherJSPFile() {
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
		
		request.setAttribute("firstname", firstname);
		request.setAttribute("lastname", lastname);
		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);
		request.setAttribute("gender", gender);
		request.setAttribute("password", password);
		
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase(action))
		{
			request.getRequestDispatcher("Q4_FetchDataFromAnOtherJSPFile.jsp").forward(request, response);
		}
		
	}

}
