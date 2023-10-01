package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService userService;
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException 
    {
    	super.init();
    	userService=new UserService(new UserDao());
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		if(email.isEmpty() || password.isEmpty())
		{
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		
		User user=userService.authenticateUser(email, password);
		
		if(user != null)
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("user", user);
			
			response.sendRedirect("/profile.jsp");
		}
		else
		{
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
