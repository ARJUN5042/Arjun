package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dao;
import com.model.Model;

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
		if(action.equalsIgnoreCase("showUser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Model m=new Dao().login(id);
			request.setAttribute("m", m);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("viewAll"))
		{
			List<Model> lists=new ArrayList<Model>();
			lists=new Dao().getAll();
			request.setAttribute("lists", lists);
			request.getRequestDispatcher("viewAll.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("Edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Model m=new Dao().login(id);
			request.setAttribute("m", m);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("Delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			int x=new Dao().delete(id);
			response.sendRedirect("index.jsp");
		}
		else if(action.equalsIgnoreCase("Update"))
		{
			Model m=new Model();
			m.setId(Integer.parseInt(request.getParameter("id")));
			m.setName(request.getParameter("name"));
			m.setMobile(request.getParameter("mobile"));
			m.setEmail(request.getParameter("email"));
			m.setPassword(request.getParameter("password"));
			int x=new Dao().update(m);
			if(x>0)
			{
				request.setAttribute("m", m);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Failed");
				request.getRequestDispatcher("update.jsp").forward(request, response);
			}
		}
	}

}
