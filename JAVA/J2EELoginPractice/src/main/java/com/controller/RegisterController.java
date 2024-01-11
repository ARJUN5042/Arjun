package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dao;
import com.model.Model;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Model m=new Model();
		m.setName(request.getParameter("name"));
		m.setMobile(request.getParameter("mobile"));
		m.setEmail(request.getParameter("email"));
		m.setPassword(request.getParameter("password"));
		int x=new Dao().insert(m);
		if(x>0) {
			request.setAttribute("msg", "SuccessFull");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "Failed");
			response.sendRedirect("register.jsp");
		}
	}

}
