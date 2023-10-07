package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.RegistrationDao;
import com.model.StudentModel;

@WebServlet("/RegisterController.do")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) 
		{

			StudentModel smodel = new StudentModel();
			smodel.setFname(request.getParameter("fname"));
			smodel.setLname(request.getParameter("lname"));
			smodel.setEmail(request.getParameter("email"));
			smodel.setMobile(request.getParameter("mobile"));
			smodel.setGender(request.getParameter("gender"));
			smodel.setPassword(request.getParameter("password"));

			int x = new RegistrationDao().doRegister(smodel);
			if (x > 0) 
			{
				System.out.println("Registerd....");
				response.sendRedirect("login.jsp");
			}
			else 
			{
				System.out.println("Not Registered...");
				response.sendRedirect("register.jsp");
			}
		}
		else if(action.equalsIgnoreCase("login"))
		{
			StudentModel lmodel=new StudentModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			
			StudentModel smodel=new RegistrationDao().getLogin(lmodel);
			if(smodel != null)
			{
				System.out.println("login successful");
				HttpSession session=request.getSession(true);
				session.setAttribute("sid", smodel.getSid());
				session.setAttribute("email", smodel.getEmail());
				
				
				session.setMaxInactiveInterval(20);
				
				response.sendRedirect("HomeController.do?action=showuser&sid="+smodel.getSid());
			}
			else
			{
				System.out.println("invalid email or password");
				response.sendRedirect("login.jsp");
			}
		}
	}

}
