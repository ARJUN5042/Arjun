package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HBDao;
import com.model.Address;
import com.model.Student;

/**
 * Servlet implementation class DataController
 */
@WebServlet("/DataController")
public class DataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DataController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("showuser"))
		{
			int addressId=Integer.parseInt(request.getParameter("addressId"));
			Address address=new HBDao().getData(addressId);
			request.setAttribute("address", address);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Address address=new Address();
		address.setStreet(request.getParameter("street"));
		address.setCity(request.getParameter("city"));
		address.setState(request.getParameter("state"));
		address.setZipcode(request.getParameter("zipcode"));
		
		Student student=new Student();
		student.setStudentName(request.getParameter("studentName"));
		student.setAddress(address);
		
		String msg=new HBDao().insertAddressData(address);
		String msg1=new HBDao().insertStudentData(student);
		if(!msg.equals("error") && !msg1.equals("error"))
		{
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("DataController?action=showuser&addressId="+address.getAddressId()).forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Register Again");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
	}

}
