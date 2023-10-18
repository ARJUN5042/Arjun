package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;
import com.model.User;

public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ActionController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    UserDao userDao=(UserDao)context.getBean("userDao");
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert"))
		{
			User user=new User();
			user.setName(request.getParameter("name"));
			user.setEmail(request.getParameter("email"));
			userDao.insert(user);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			userDao.delete(id);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			User user=userDao.getUser(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("update.jsp").forward(request, response);
//			response.sendRedirect("update.jsp");
		}
		else if(action.equalsIgnoreCase("update"))
		{
			User user=new User();
			user.setId(Integer.parseInt(request.getParameter("id")));
			user.setName(request.getParameter("name"));
			user.setEmail(request.getParameter("email"));
			userDao.update(user);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("query"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			User user=userDao.getUser(id);
			request.setAttribute("id", id);
			request.setAttribute("User", user);
			request.getRequestDispatcher("s-user.jsp").forward(request, response);
		}
	}

}
