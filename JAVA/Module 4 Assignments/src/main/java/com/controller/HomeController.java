	package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HomeDao;
import com.model.StudentModel;

@WebServlet("/HomeController.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("showuser")) 
		{
			int sid = Integer.parseInt(request.getParameter("sid"));
			System.out.println("Into Login Phase");
			StudentModel hmodel = new HomeDao().getLogin(sid);
			request.setAttribute("hmodel", hmodel);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		} 
		else if(action.equalsIgnoreCase("edituser"))
		{
			int sid=Integer.parseInt(request.getParameter("sid"));
			StudentModel homemodel=new HomeDao().getLogin(sid);
			request.setAttribute("homemodel", homemodel);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
		
		  else if(action.equalsIgnoreCase("deleteuser")) 
		  { 
			  StudentModel dmodel=new StudentModel();
			  dmodel.setSid(Integer.parseInt(request.getParameter("sid")));
			  dmodel.setFname(request.getParameter("fname"));
			  dmodel.setLname(request.getParameter("lname"));
			  dmodel.setEmail(request.getParameter("email"));
			  dmodel.setMobile(request.getParameter("mobile"));
			  dmodel.setGender(request.getParameter("gender"));
			  dmodel.setPassword(request.getParameter("password"));
			  int sid=Integer.parseInt(request.getParameter("sid")); 
			  dmodel = new HomeDao().getLogin(sid);
			  int x=new HomeDao().deleteInsertUser(dmodel);  
			  int y=new HomeDao().deleteUser(sid);
			  if(x>0 && y>0)
			  {
				  System.out.println("Record insert into delete table... and delete from student table....");
				  request.setAttribute("msg", "Record Deleted...");
				  response.sendRedirect("login.jsp");
			  }

			   
		  }
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentModel hmodel = new StudentModel();
		hmodel.setSid(Integer.parseInt(request.getParameter("sid")));
		hmodel.setFname(request.getParameter("fname"));
		hmodel.setLname(request.getParameter("lname"));
		hmodel.setEmail(request.getParameter("email"));
		hmodel.setMobile(request.getParameter("mobile"));
		hmodel.setGender(request.getParameter("gender"));
		hmodel.setPassword(request.getParameter("password"));

		int x = new HomeDao().updateUser(hmodel);
		if (x > 0) 
		{
			System.out.println("Record Updated...");
			response.sendRedirect("HomeController.do?action=showuser&sid=" + hmodel.getSid());
		}

	}

}
