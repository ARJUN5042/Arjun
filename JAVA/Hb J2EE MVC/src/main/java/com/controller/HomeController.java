package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HBDao;
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
		if(action.equals("showuser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			UserModel model=new HBDao().verifyLogin(uid);
			request.setAttribute("model", model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else if(action.equals("edituser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			UserModel hmodel=new HBDao().verifyLogin(uid);
			request.setAttribute("hmodel", hmodel);
			request.getRequestDispatcher("home1.jsp").forward(request, response);
		}
		else if(action.equals("deleteuser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			int x=new HBDao().deleteUser(uid);
			request.setAttribute("msg", "Record Deleted...");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel homemodel=new UserModel();
		homemodel.setUid(Integer.parseInt(request.getParameter("uid")));
		homemodel.setFirstname(request.getParameter("firstname"));
		homemodel.setLastname(request.getParameter("lastname"));
		homemodel.setUsername(request.getParameter("username"));
		homemodel.setPassword(request.getParameter("password"));
		
		int x=new HBDao().updateUser(homemodel);
		if(x>0)
		{
			response.sendRedirect("HomeController?action=showuser&uid="+homemodel.getUid());
		}
	}

}
