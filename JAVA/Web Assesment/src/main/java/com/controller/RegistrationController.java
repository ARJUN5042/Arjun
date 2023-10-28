package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDao;
import com.model.UserModel;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel u=new UserModel();
		u.setFirstname(request.getParameter("firstname"));
		u.setLastname(request.getParameter("lastname"));
		u.setEmail(request.getParameter("email"));
		u.setMobile(request.getParameter("mobile"));
		u.setAddress(request.getParameter("address"));
		u.setGender(request.getParameter("gender"));
		u.setPassword(request.getParameter("password"));
		
		int x=new RegistrationDao().doRegister(u);
		if(x>0)
		{
			request.setAttribute("u", u);
			System.out.println("Registration Successful..");
			response.sendRedirect("login.jsp");
		}
		else
		{
			System.out.println("Registration not successful..");
			response.sendRedirect("register.jsp");
		}
	}
}
