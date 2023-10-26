package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.dao.UserDao;
import com.model.User;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    UserDao userDao=(UserDao)context.getBean("userDao");
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			User user=new User();
			user.setFirstname(request.getParameter("firstname"));
			user.setLastname(request.getParameter("lastname"));
			user.setEmail(request.getParameter("email"));
			user.setMobile(request.getParameter("mobile"));
			user.setPassword(request.getParameter("password"));
			user.setGender(request.getParameter("gender"));
			
			userDao.insert(user);
			response.sendRedirect("login.jsp");			
		}
		else if(action.equalsIgnoreCase("Login"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			User user=userDao.getLogin(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
			
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			User user=userDao.getLogin(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("editupdate.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			userDao.delete(id);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			User user=new User();
			user.setId(Integer.parseInt(request.getParameter("id")));
			user.setFirstname(request.getParameter("firstname"));
			user.setLastname(request.getParameter("lastname"));
			user.setEmail(request.getParameter("email"));
			user.setMobile(request.getParameter("mobile"));
			user.setPassword(request.getParameter("password"));
			user.setGender(request.getParameter("gender"));
			
			userDao.update(user);
			response.sendRedirect("profile.jsp");
		}
	}

}
