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
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("succ-pay"))
		{
			BookModel bmodel=new BookModel();
			bmodel.setBid(Integer.parseInt(request.getParameter("bid")));
			bmodel.setBstatus("done");
			bmodel.setPstatus("successful");
			int x=new CustomerDao().payment(bmodel);
			{
				if(x>0)
				{
					response.sendRedirect("cust-home.jsp");
				}
				else
				{
					System.out.println("something went wrong...");
				}
			}
		}

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
						session.setAttribute("customerid", model.getCustomerid());
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
						int bid=new CustomerDao().getBookID(bmodel.getCustomerid());
						response.sendRedirect("payment.jsp?price="+bmodel.getPrice()+"&bid="+bid);
					}
					else {
						System.out.println("did not get book id");
					}
				}
				
				else if(action.equalsIgnoreCase("editprofile"))
				{
					CustomerModel hmodel=new CustomerModel();
					int customerid=new CustomerDao().getCustomerid(hmodel.getCustomerid());
					response.sendRedirect("editprofile.jsp");
				}
				else if(action.equalsIgnoreCase("updateprofile"))
				{
					CustomerModel hmodel=new CustomerModel();
					hmodel.setCustomerid(Integer.parseInt(request.getParameter("customerid")));
					hmodel.setFirstname(request.getParameter("firstname"));
					hmodel.setLastname(request.getParameter("lastname"));
					hmodel.setGender(request.getParameter("gender"));
					hmodel.setAddress(request.getParameter("address"));
					hmodel.setCity(request.getParameter("city"));
					hmodel.setPincode(Integer.parseInt(request.getParameter("pincode")));
					hmodel.setMobno(request.getParameter("mobno"));
					
					int x=new CustomerDao().updateCustomer(hmodel);
					if(x>0)
					{
						response.sendRedirect("login.jsp");
					}
					else
					{
						System.out.println("profile not changed..");
					}
				}
				else if(action.equalsIgnoreCase("changepassword"))
				{
					CustomerModel hmodel=new CustomerModel();
					int customerid=new CustomerDao().getCustomerid(hmodel.getCustomerid());
					response.sendRedirect("changepassword.jsp");
				}
				else if (action.equalsIgnoreCase("savepassword")) 
				{
					System.out.println("into change password process");
					CustomerModel hmodel = new CustomerModel();
					hmodel.setCustomerid(Integer.parseInt(request.getParameter("customerid")));
					hmodel.setPassword(request.getParameter("npassword"));
					String currentPassword = request.getParameter("password");
					if (!currentPassword.equals("npassword")) 
					{
						int x = new CustomerDao().updatePassword(hmodel, currentPassword);
						
						if (x > 0) 
						{
							System.out.println("Password Changed");

							try 
							{
								out.println("<h1>Processing..." + "<br>" + "<h2>Please wait.</h2>");
							} 
							finally 
							{
								try 
								{
									Thread.sleep(3000);

									request.getRequestDispatcher("login.jsp").forward(request, response);

									out.close();

								}
								catch (Exception e) 
								{
									e.printStackTrace();
								}
//							response.sendRedirect("login.jsp");
							}
						}
						else 
						{
							System.out.println("error");
						}
					} 
					else 
					{
						System.out.println("Error while Changing Password.");
						response.sendRedirect("changepassword.jsp");
					}
				}
	}

}
