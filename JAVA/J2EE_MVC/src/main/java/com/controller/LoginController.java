package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;

import model.UserModel;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel lmodel = new UserModel();
		lmodel.setUsername(request.getParameter("username"));
		lmodel.setPassword(request.getParameter("password"));
		
		UserModel model=new LoginDao().getLogin(lmodel);
		if(model != null)
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("userid", model.getUserid());
			session.setAttribute("username", model.getUsername());
			session.setMaxInactiveInterval(60);
			response.sendRedirect("HomeController.do?action=showuser&userid="+model.getUserid());
			
		}
	}
}
