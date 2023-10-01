package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;
import com.util.EmailUtil;
import com.util.OTPUtil;

@WebServlet("/register")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
       
    public RegistrationController() {
        super();
    }
    
    @Override
    public void init() throws ServletException 
    {
    	super.init();
    	userService = new UserService(new UserDao());
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		
		if(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || mobile.isEmpty() || password.isEmpty())
		{
			request.getRequestDispatcher("registration.jsp").forward(request, response);
			return;			
		}
		
		if(userService.isEmailRegistered(email))
		{
			request.getRequestDispatcher("registration.jsp").forward(request, response);
			return;
		}
		
		String otp=OTPUtil.generateOTP();
		User user=new User(firstName, lastName, email, mobile, password);
		boolean userCreated=userService.createUser(user);
		
		if(userCreated)
		{
			EmailUtil.sendOTP(email, otp);
			response.sendRedirect("verify-otp.jsp");
		}
		else
		{
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}
	}
}
