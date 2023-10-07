package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HomeDao;

import model.UserModel;
@WebServlet("/HomeController.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("showuser"))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			System.out.println("You are enter into login phase");
			UserModel hmodel=new HomeDao().getLogin(userid);
			request.setAttribute("hmodel", hmodel);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("edituser"))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			
			UserModel homemodel=new HomeDao().getLogin(userid);
			request.setAttribute("homemodel", homemodel);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("deleteuser"))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			
			int x=new HomeDao().deleteUser(userid);
			request.setAttribute("msg", "Record Deleted");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel homemodel = new UserModel();
		homemodel.setUserid(Integer.parseInt(request.getParameter("userid")));
		homemodel.setFirstname(request.getParameter("firstname"));
		homemodel.setLastname(request.getParameter("lastname"));
		homemodel.setUsername(request.getParameter("username"));
		homemodel.setPassword(request.getParameter("password")); 
		
		int x=new HomeDao().updateUser(homemodel);
		if(x>0)
		{
			response.sendRedirect("HomeController.do?action=showuser&userid="+homemodel.getUserid());
		}
	}
}
