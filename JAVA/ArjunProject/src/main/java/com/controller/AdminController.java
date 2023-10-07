package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.AdminDao;
import com.model.AddServicesModel;
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
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("addservice"))
		{
			AddServicesModel asm=new AddServicesModel();
			asm.setServicename(request.getParameter("servicename"));
			
			String savePath = "D:\\selenium java\\ArjunProject\\src\\main\\webapp\\uploadimage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) 
			{
				fileSaveDir.mkdir();
			}
			Part file=request.getPart("image");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
			
			asm.setImage(fileName);
			int x=new AdminDao().addMainServices(asm);
			if(x>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			
		}
		else if(action.equalsIgnoreCase("addsubservice"))
		{
			SubServiceModel ssm=new SubServiceModel();
			ssm.setServiceid(Integer.parseInt(request.getParameter("serviceid")));
			ssm.setSubsname(request.getParameter("subsname"));
			ssm.setContent(request.getParameter("content"));
			String savePath = "D:\\selenium java\\ArjunProject\\src\\main\\webapp\\uploadimage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) 
			{
				fileSaveDir.mkdir();
			}
			Part file=request.getPart("image");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
			
			ssm.setImage(fileName);
			ssm.setPrice(request.getParameter("price"));
			
			int x=new AdminDao().addSubServices(ssm);
			if(x>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			
		}
	}

}
