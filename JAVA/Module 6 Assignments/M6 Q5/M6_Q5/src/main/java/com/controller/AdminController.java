package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.AdminDao;
import com.dao.UserDao;
import com.model.Admin;

public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }
   ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
   AdminDao adminDao=(AdminDao)context.getBean("adminDao");
   UserDao userDao=(UserDao)context.getBean("userDao");
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("login"))
		{
			Admin admin=new Admin();
			admin.setUsername(request.getParameter("username"));
			admin.setPassword(request.getParameter("password"));
			
			adminDao.getAllUser();
			response.sendRedirect("adminhome.jsp");
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			adminDao.deleteUser(id);
			response.sendRedirect("adminhome.jsp");
		}
	}

}
