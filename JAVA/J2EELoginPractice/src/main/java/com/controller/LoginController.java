package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Dao;
import com.model.Model;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Model m =new Model();
		m.setEmail(request.getParameter("email"));
		m.setPassword(request.getParameter("password"));
		
		Model m1=new Dao().login(m);
		if(m1 != null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("model", m1);
			request.setAttribute("model", m1);
			response.sendRedirect("HomeController?action=showUser&id="+m1.getId());
		}
		else
		{
			request.setAttribute("msg", "Failed");
			response.sendRedirect("login.jsp");
		}
	}

}
