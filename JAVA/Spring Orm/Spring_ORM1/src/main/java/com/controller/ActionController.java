package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ActionController() {
        super();
        // TODO Auto-generated constructor stub
    }
    ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    StudentDao dao=(StudentDao)context.getBean("studentDao");
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("insert"))
		{
			Student s=new Student();
			s.setName(request.getParameter("name"));
			s.setCity(request.getParameter("city"));
			dao.insert(s);
			response.sendRedirect("show.jsp");
			
		}
		else if(action.equals("EDIT"))
		{
			int sid=Integer.parseInt(request.getParameter("sid"));
			Student s=dao.getStudent(sid);
			request.setAttribute("s", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
			
		}
		else if(action.equals("DELETE"))
		{
			int sid=Integer.parseInt(request.getParameter("sid"));
			dao.delete(sid);
			response.sendRedirect("show.jsp");
			
		}
		else if(action.equals("update"))
		{
			Student s=new Student();
			s.setSid(Integer.parseInt(request.getParameter("sid")));
			s.setName(request.getParameter("name"));
			s.setCity(request.getParameter("city"));
			dao.update(s);
			response.sendRedirect("show.jsp");
		}
	}

}
