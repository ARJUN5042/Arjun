package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.model.UserModel;

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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		UserModel lmodel=new UserModel();
		lmodel.setUsername(request.getParameter("username"));
		lmodel.setPassword(request.getParameter("password"));
		
		UserModel model=new LoginDao().doLogin(lmodel);
		if(model != null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("userid", model.getUserid());
			session.setAttribute("username", model.getUsername());
			
			response.sendRedirect("HomeController?action=showuser&userid="+model.getUserid());
		}
		else
		{
			out.println("<h1>No Record Found</h1>");
		}
	}

}
