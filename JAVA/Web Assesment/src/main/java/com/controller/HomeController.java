package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HomeDao;
import com.model.UserModel;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("user"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			UserModel hmodel=new HomeDao().getLogin(uid);
			request.setAttribute("hmodel", hmodel);
			System.out.println(1);
			request.getRequestDispatcher("user-home.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel hmodel=new UserModel();
		hmodel.setUid(Integer.parseInt(request.getParameter("uid")));
		hmodel.setPassword(request.getParameter("npassword"));
		
		int x=new HomeDao().updatePass(hmodel);
		if(x>0)
		{
			System.out.println("Password Updated..");
			response.sendRedirect("login.jsp");
		}
		else
		{
			System.out.println("error");
		}
		
		
	}

}
