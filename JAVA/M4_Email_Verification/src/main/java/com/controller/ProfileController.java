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

@WebServlet("/profile")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UserService userService;
    public ProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
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
		
		User user=(User) request.getSession().getAttribute("user");
		if(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || mobile.isEmpty())
		{
			request.getRequestDispatcher("/profile.jsp").forward(request, response);
			return;
		}
		
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setMobile(mobile);
		
		boolean userUpdated = userService.updateUser(user);
		
		if(userUpdated)
		{
			response.sendRedirect("/profile.jsp?success=true");
		}
		else
		{
			request.getRequestDispatcher("/profile.jsp").forward(request, response);
		}
	}

}
