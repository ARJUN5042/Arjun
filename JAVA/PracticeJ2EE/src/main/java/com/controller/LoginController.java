package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.model.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		User user=new User();
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
		User u = new UserDao().getLogin(user);
		if(u != null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("id", u.getId());
			session.setAttribute("u", u);
			response.sendRedirect("HomeController?action=showuser&id="+u.getId());
		}
		else
		{
			request.setAttribute("msg", "Email or Password Invalid");
			response.sendRedirect("login.jsp");
		}
		
	}

}
