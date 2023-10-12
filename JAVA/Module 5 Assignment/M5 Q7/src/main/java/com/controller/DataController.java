package com.controller;

import java.io.IOException;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HBDao;
import com.model.Reader;
import com.model.Subscription;

@WebServlet("/DataController")
public class DataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DataController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HashSet<Reader> subs=new HashSet<Reader>();
		Reader reader=new Reader();
		reader.setFirstname(request.getParameter("firstname"));
		reader.setLastname(request.getParameter("lastname"));
		reader.setEmail(request.getParameter("email"));
		
		Subscription subscription=new Subscription();
		subscription.setSubscriptionName(request.getParameter("subscriptionName"));
		subscription.setReaders(subs);
		
		HBDao dao=new HBDao();
		String msg=new HBDao().doInsert(reader);
		subs.add(reader);
		String msg1=new HBDao().doInsert(subscription);
		
		if(!msg.equals("error") && !msg1.equals("error"))
		{
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Insert Again");
			request.getRequestDispatcher("insert.jsp").forward(request, response);
		}
		
	}

}
