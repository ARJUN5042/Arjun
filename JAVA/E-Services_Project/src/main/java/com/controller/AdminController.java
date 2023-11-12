package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.dao.AdminDao;
import com.model.AddServicesModel;
import com.model.AdminModel;
import com.model.AssignServicemanModel;
import com.model.BookModel;
import com.model.RatingFeedbackModel;
import com.model.SubServiceModel;

@WebServlet("/AdminController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, // 512MB
		maxFileSize = 1024 * 1024 * 512, // 512MB
		maxRequestSize = 1024 * 1024 * 512) // 512MB
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminController() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String extractfilename(Part file) {
		String cd = file.getHeader("content-disposition");
		String[] items = cd.split(";");
		for (String string : items) {
			if (string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2, string.length() - 1);
			}
		}
		return "";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("Login"))
		{
			AdminModel amodel=new AdminModel();
			amodel.setUsername(request.getParameter("username"));
			amodel.setPassword(request.getParameter("password"));
			AdminModel model=new AdminDao().getAdmin(amodel);
			if(model != null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("model", model);
				session.setAttribute("username", model.getUsername());
				session.setAttribute("msg", "Into Dashboard");
				response.sendRedirect("admin/dashboard.jsp");
				
			}
			else
			{
				HttpSession session=request.getSession();
				session.setAttribute("msg", "invalid username or password");
				response.sendRedirect("admin/index.jsp");
			}
		}
		else if (action.equalsIgnoreCase("addservice")) 
		{
			AddServicesModel asm = new AddServicesModel();
			asm.setServicename(request.getParameter("servicename"));

			String savePath = "D:\\Arjun\\JAVA\\E-Services_Project\\src\\main\\webapp\\uploadimage";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file = request.getPart("image");
			String fileName = extractfilename(file);
			file.write(savePath + File.separator + fileName);

			asm.setImage(fileName);
			int x = new AdminDao().addMainServices(asm);
			if (x > 0) {
				response.sendRedirect("admin/dashboard.jsp");
			}
		}
		else if(action.equalsIgnoreCase("addsubservice"))
		{
			SubServiceModel ssm=new SubServiceModel();
			ssm.setServiceid(Integer.parseInt(request.getParameter("serviceid")));
			ssm.setSubsname(request.getParameter("subsname"));
			ssm.setContent(request.getParameter("content"));
			
			String savePath = "D:\\Arjun\\JAVA\\E-Services_Project\\src\\main\\webapp\\uploadimage";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file = request.getPart("image");
			String fileName = extractfilename(file);
			file.write(savePath + File.separator + fileName);

			ssm.setImage(fileName);
			ssm.setPrice(request.getParameter("price"));
			
			int x=new AdminDao().addSubServices(ssm);
			if (x>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
		}
		
		else if(action.equalsIgnoreCase("assign"))
		{
			AssignServicemanModel asm=new AssignServicemanModel();
			asm.setBid(Integer.parseInt(request.getParameter("bid")));
			asm.setServiceid(Integer.parseInt(request.getParameter("serviceid")));
			asm.setSubid(Integer.parseInt(request.getParameter("subid")));
			asm.setCustomerid(Integer.parseInt(request.getParameter("customerid")));
			asm.setServicemanid(Integer.parseInt(request.getParameter("servicemanid")));
			Date d1=new Date();
			SimpleDateFormat sm=new SimpleDateFormat("dd/MM/yyyy");
			asm.setAdate(sm.format(d1).toString());
			
			BookModel bmodel=new BookModel();
			bmodel.setBid(Integer.parseInt(request.getParameter("bid")));
			bmodel.setBstatus("assigned");
			int x=new AdminDao().assignServiceman(asm);
			int y=new AdminDao().assignedService(bmodel);
			if(x>0 && y>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else
			{
				System.out.println("assign table error");
			}
			
		}
		
		else if(action.equalsIgnoreCase("rating")) 
		{
			int bid=Integer.parseInt(request.getParameter("bid"));
			response.sendRedirect("admin/rating-feedback.jsp?bid="+bid);
			
		}
		
		else if(action.equalsIgnoreCase("Update Rating"))
		{
			int bid = Integer.parseInt(request.getParameter("bid").trim());
		    int rating = Integer.parseInt(request.getParameter("rating"));
		    String feedback = request.getParameter("feedback");
			AdminDao dao=new AdminDao();
			dao.updateRating(bid, rating, feedback);
			
			response.sendRedirect("admin/dashboard.jsp");
		}
		
		
	}

}
