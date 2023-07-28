package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;
import com.model.BookModel;
import com.model.CustomerModel;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
				String action=request.getParameter("action");
				if(action.equalsIgnoreCase("login"))
				{
					CustomerModel lmodel = new CustomerModel();
					lmodel.setEmail(request.getParameter("email"));
					lmodel.setPassword(request.getParameter("password"));
					CustomerModel model = new CustomerDao().doLogin(lmodel);
					if (model != null)
					{
						HttpSession session = request.getSession();
						session.setAttribute("model", model);
						session.setAttribute("firstname", model.getFirstname());
						session.setAttribute("lastname", model.getLastname());
						response.sendRedirect("cust-home.jsp");
					}
					
				}
				else if(action.equalsIgnoreCase("register"))
				{
					CustomerModel rmodel = new CustomerModel();

					rmodel.setFirstname(request.getParameter("firstname"));
					rmodel.setLastname(request.getParameter("lastname"));
					rmodel.setGender(request.getParameter("gender"));
					rmodel.setAddress(request.getParameter("address"));
					rmodel.setCity(request.getParameter("city"));
					String pincodep = request.getParameter("pincode");
					if (pincodep != null)
					{
						int pincode = Integer.parseInt(pincodep);
						rmodel.setPincode(pincode);
					}
					rmodel.setMobno(request.getParameter("mobno"));
					rmodel.setEmail(request.getParameter("email"));
					rmodel.setPassword(request.getParameter("password"));
					rmodel.setStatus(request.getParameter("status"));

					int x = new CustomerDao().doRegister(rmodel);
					if (x > 0) 
					{
						request.setAttribute("msg", "Record Inserted...");
						if (!response.isCommitted()) 
						{
							response.sendRedirect("login.jsp");
						}
					} else 
					{
						request.setAttribute("msg", "Record Not Inserted...");
						response.sendRedirect("register.jsp");
					}
				}
				else if(action.equalsIgnoreCase("placeorder"))
				{
					BookModel bmodel= new BookModel();
					bmodel.setSubid(Integer.parseInt(request.getParameter("subid")));
					bmodel.setCustomerid(Integer.parseInt(request.getParameter("customerid")));
					Date d1=new Date();
					SimpleDateFormat sm=new SimpleDateFormat("dd/MM/yyyy");
					bmodel.setBdate(sm.format(d1).toString());
					bmodel.setPrice(request.getParameter("price"));
					bmodel.setBstatus("Pending");
					bmodel.setPstatus("Pending");
					int x=new CustomerDao().bookServices(bmodel);
					if(x>0)
					{
						response.sendRedirect("payment.jsp?price="+bmodel.getPrice());
//						out.println("<script type=\"text/javascript\">");
//						out.println("alert('Booked Service Successfully !');");
//						out.println("window.location.href='cust-home.jsp';");
//						out.println("</script>");
//						response.sendRedirect("cust-home.jsp");
					}
				}
				
	}

}
