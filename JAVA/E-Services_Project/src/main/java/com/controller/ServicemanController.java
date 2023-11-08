package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;
import com.dao.ForgotDao;
import com.dao.ServicemanDao;
import com.model.BookModel;
import com.model.CustomerModel;
import com.model.ServicemanModel;

@WebServlet("/ServicemanController")
public class ServicemanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServicemanController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			ServicemanModel smodel = new ServicemanModel();
			smodel.setFirstname(request.getParameter("firstname"));
			smodel.setLastname(request.getParameter("lastname"));
			smodel.setEmail(request.getParameter("email"));
			smodel.setMobile(request.getParameter("mobile"));
			smodel.setAddress(request.getParameter("address"));
			smodel.setCity(request.getParameter("city"));
			smodel.setPincode(request.getParameter("pincode"));
			smodel.setGender(request.getParameter("gender"));
			smodel.setExpertise(request.getParameter("expertise"));
			String expertise = request.getParameter("expertise");
			System.out.println("Expertise: " + expertise);
			smodel.setPassword(request.getParameter("password"));

			int x = new ServicemanDao().doRegiser(smodel);
			if (x > 0) {
				request.setAttribute("msg", "Record Inserted...");
				System.out.println("Record Inserted");
				if (!response.isCommitted()) {
					response.sendRedirect("serviceman/slogin.jsp");
				}
			} else {
				request.setAttribute("msg", "Record Not Inserted...");
				System.out.println("error");
				response.sendRedirect("serviceman/sregister.jsp");
			}
		}

		else if (action.equalsIgnoreCase("login")) {
			ServicemanModel lmodel = new ServicemanModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			ServicemanModel model = new ServicemanDao().doLogin(lmodel);
			if (model != null) {
				HttpSession session = request.getSession();
				session.setAttribute("model", model);
				session.setAttribute("servicemanid", model.getServicemanid());
				session.setAttribute("firstname", model.getFirstname());
				session.setAttribute("lastname", model.getLastname());
				response.sendRedirect("serviceman/s-dashboard.jsp");
			}
		}

		else if (action.equalsIgnoreCase("edit")) {
			HttpSession session = request.getSession();
			ServicemanModel smodel = (ServicemanModel) session.getAttribute("model");
			if (smodel != null) {
				int servicemanid = new ServicemanDao().getSetvicemanId(smodel.getServicemanid());
				response.sendRedirect("serviceman/s-editprofile.jsp");
			} else {
				System.out.println("smodel is null");
			}
		} else if (action.equalsIgnoreCase("update")) {
			ServicemanModel smodel = new ServicemanModel();
			smodel.setServicemanid(Integer.parseInt(request.getParameter("servicemanid")));
			smodel.setFirstname(request.getParameter("firstname"));
			smodel.setLastname(request.getParameter("lastname"));
			smodel.setEmail(request.getParameter("email"));
			smodel.setMobile(request.getParameter("mobile"));
			smodel.setAddress(request.getParameter("address"));
			smodel.setCity(request.getParameter("city"));
			smodel.setPincode(request.getParameter("pincode"));
			smodel.setGender(request.getParameter("gender"));
			smodel.setExpertise(request.getParameter("expertise"));

			int x = new ServicemanDao().updateServiceman(smodel);
			if (x > 0) {
				response.sendRedirect("serviceman/s-dashboard.jsp");
			} else {
				System.out.println("profile not updated");
			}
		}

		else if (action.equalsIgnoreCase("changepassword")) {
			ServicemanModel smodel = new ServicemanModel();
			int servicemanid = new ServicemanDao().getSetvicemanId(smodel.getServicemanid());
			response.sendRedirect("serviceman/s-changepassword.jsp");
		}

		else if (action.equalsIgnoreCase("updatepassword")) {
			ServicemanModel smodel = new ServicemanModel();
			smodel.setServicemanid(Integer.parseInt(request.getParameter("servicemanid")));
			smodel.setPassword(request.getParameter("npassword"));
			String currentPassword = request.getParameter("password");
			if (!currentPassword.equals("npassword")) {
				int x = new ServicemanDao().updatePassword(smodel, currentPassword);

				if (x > 0) {
					System.out.println("Password Changed");

					try {
						out.println("<h1>Processing..." + "<br>" + "<h2>Please wait.</h2>");
					} finally {
						try {
							Thread.sleep(3000);
							System.out.println("wait 3 second");

							response.sendRedirect("serviceman/slogin.jsp");
							System.out.println("Redirect to login page");
							out.close();

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} else {
					System.out.println("error");
				}
			} else {
				System.out.println("Error while Changing Password.");
				response.sendRedirect("serviceman/s-changepassword.jsp");
			}
		}

		else if (action.equalsIgnoreCase("submit")) {
			String email = request.getParameter("email");
			ServicemanModel f = new ServicemanModel();
			ServicemanDao dao = new ServicemanDao();
			f = dao.checkEmail(email);
			if (f == null) {
				request.setAttribute("invalidemail", "Email Address Not Valid");
				request.getRequestDispatcher("serviceman/forgotpassword.jsp").forward(request, response);
			} else {

				String emailid = f.getEmail();
				String username = f.getFirstname() + " " + f.getLastname();
				final String Senderid = "hirparaarjun49@gmail.com";
				final String password = "pcpjalqcnrjmiwfd";

				Properties props = new Properties();

				String host = "smtp.gmail.com";

				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.socketFactory.fallback", "true");
				props.put("mail.smtp.ssl.protocols", "TLSv1.2");
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.debug", "true");
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.port", "465");
				props.put("mail.smtp.user", Senderid);
				props.put("mail.smtp.password", password);

				Session session = Session.getInstance(props, new Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(Senderid, password);
					}
				});

				try {
					Random rand = new Random();
					int otp = rand.nextInt(900000) + 100000;
					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress(Senderid));
					message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailid));// to
																									// mail
																									// address.
					message.setSubject("OTP Request");
					String msg1 = "<!DOCTYPE html><html><head></head><body><center><div style='background-color:#f8f8f8; width:500px; height:200px'><div style='background-color:#00e58b; width:500px; height:50px'><h3 style='color:white; padding-top:10px;'>EmailDemo.com </h3></div><p style='color:gray; margin-left:-300px;'>Dear "
							+ username + ",</p><br><p style='color:gray; margin-top:-10px;'>" + otp
							+ "  is your One Time Password.Do NOT share this code with anyone for security reasons.this is valid for 10 minutes.</p><div></center></body></html>";
					message.setContent(msg1, "text/html; charset=utf-8");

					Transport.send(message);

					HttpSession otpsession = request.getSession();
					otpsession.setAttribute("otp", otp);
					otpsession.setMaxInactiveInterval(10 * 60); /* Session Set for 10 minutes */
					otpsession.setAttribute("UserData", f);
					response.sendRedirect("serviceman/sendOTP.jsp");
				} catch (Exception e) {
					request.setAttribute("msg", "Otp Not Send");
					request.getRequestDispatcher("serviceman/forgotpassword.jsp").forward(request, response);
					e.printStackTrace();
				}
			}

		}

		else if (action.equalsIgnoreCase("verify")) {
			HttpSession session = request.getSession(false);
			String G_otp = String.valueOf(session.getAttribute("otp"));
			String E_otp = request.getParameter("EnterOTP");

			if (G_otp.equalsIgnoreCase(E_otp)) {
				request.setAttribute("Otpmatch", "OTP Match");
				response.sendRedirect("serviceman/ResetPassword.jsp");
			} else {
				request.setAttribute("notmatch", "OTP Not Match");
				request.getRequestDispatcher("serviceman/SendOTP.jsp").forward(request, response);
			}
		}

		else if (action.equalsIgnoreCase("Confirm")) {
			String pswd = request.getParameter("npassword");
			ServicemanModel f = new ServicemanModel();
			HttpSession session = request.getSession(false);
			f = (ServicemanModel) session.getAttribute("UserData");
			f.setPassword(pswd);
			f.setServicemanid(f.getServicemanid());
			ServicemanDao dao = new ServicemanDao();
			int r = dao.resetPassword(f);
			if (r > 0) {
				response.sendRedirect("serviceman/slogin.jsp");
				System.out.println("Password Reset Successfully..");
			} else {
				System.out.println("error");
			}
		}

		else if (action.equalsIgnoreCase("confirmservice")) {
			BookModel bmodel = new BookModel();
			bmodel.setBid(Integer.parseInt(request.getParameter("bid")));
			bmodel.setBstatus("confirm");
			int x = new ServicemanDao().confirmService(bmodel);
			if (x > 0) {
				response.sendRedirect("serviceman/s-dashboard.jsp");
			}
		}

		else if (action.equalsIgnoreCase("rejectservice")) {
			BookModel bmodel = new BookModel();
			bmodel.setBid(Integer.parseInt(request.getParameter("bid")));
			bmodel.setBstatus("done");
			int x = new ServicemanDao().rejectService(bmodel);
			if (x > 0) {
				response.sendRedirect("serviceman/s-dashboard.jsp");
			}
		}

		else if (action.equalsIgnoreCase("endservice")) {
			BookModel bmodel = new BookModel();
			int bid = Integer.parseInt(request.getParameter("bid"));
			CustomerModel f = new CustomerModel();
			ServicemanDao dao = new ServicemanDao();
			String email = dao.getCustomerEmail(bid);
			if (f == null) {
				request.getRequestDispatcher("serviceman/confirmedservices.jsp").forward(request, response);
			} else {

				String emailid = dao.getCustomerEmail(bid);
				System.out.println(emailid);
				String username = f.getFirstname() + " " + f.getLastname();
				System.out.println(username);
				final String Senderid = "hirparaarjun49@gmail.com";
				final String password = "pcpjalqcnrjmiwfd";

				Properties props = new Properties();

				String host = "smtp.gmail.com";

				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.socketFactory.fallback", "true");
				props.put("mail.smtp.ssl.protocols", "TLSv1.2");
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.debug", "true");
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.port", "465");
				props.put("mail.smtp.user", Senderid);
				props.put("mail.smtp.password", password);

				Session session = Session.getInstance(props, new Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(Senderid, password);
					}
				});

				try {
					Random rand = new Random();
					int otp = rand.nextInt(900000) + 100000;
					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress(Senderid));
					message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailid));// to
																									// mail
																									// address.
					message.setSubject("OTP Request");
					String msg1 = "<!DOCTYPE html><html><head></head><body><center><div style='background-color:#f8f8f8; width:500px; height:200px'><div style='background-color:#00e58b; width:500px; height:50px'><h3 style='color:white; padding-top:10px;'>EmailDemo.com </h3></div><p style='color:gray; margin-left:-300px;'>Dear "
							+ username + ",</p><br><p style='color:gray; margin-top:-10px;'>" + otp
							+ "  is your One Time Password for after complete service by serviceman.Do NOT share this code with anyone for security reasons.this is valid for 10 minutes.</p><div></center></body></html>";
					message.setContent(msg1, "text/html; charset=utf-8");

					Transport.send(message);

					HttpSession otpsession = request.getSession();
					otpsession.setAttribute("otp", otp);
					otpsession.setMaxInactiveInterval(10 * 60); /* Session Set for 10 minutes */
					otpsession.setAttribute("UserData", f);

					response.sendRedirect("serviceman/enterOTP.jsp");
				} catch (Exception e) {
					request.setAttribute("msg", "Otp Not Send");
					request.getRequestDispatcher("serviceman/confirmedservices.jsp").forward(request, response);
					e.printStackTrace();
				}
			}
		}

		else if (action.equalsIgnoreCase("verifyotpendservice")) {
			HttpSession session = request.getSession(false);
			String G_otp = String.valueOf(session.getAttribute("otp"));
			String E_otp = request.getParameter("EnterOTP");
			int bid=Integer.parseInt(request.getParameter("bid"));
			BookModel bmodel = new BookModel();
			

			String additionalCharge = request.getParameter("additionalCharge");
			if (G_otp.equalsIgnoreCase(E_otp)) {
				request.setAttribute("Otpmatch", "OTP Match");
				if (additionalCharge != null) {
					bmodel.setBstatus("completed");
					int x = new ServicemanDao().endService(bmodel, additionalCharge);
					response.sendRedirect("serviceman/enterOTP.jsp");
				}
				response.sendRedirect("serviceman/s-dashboard.jsp");
			} else {
				request.setAttribute("notmatch", "OTP Not Match");
				request.getRequestDispatcher("serviceman/enterOTP.jsp").forward(request, response);
			}
		}

	}

}
