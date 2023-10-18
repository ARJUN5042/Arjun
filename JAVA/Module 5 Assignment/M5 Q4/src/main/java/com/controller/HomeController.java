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

import com.dao.RegisterDao;
import com.model.User;

@WebServlet("/HomeController")
@MultipartConfig(fileSizeThreshold = 1024*1024*512,
				maxFileSize = 1024*1024*512,
				maxRequestSize = 1024*1024*512)
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

    private String extractfilename(Part file)
    {
    	String cd=file.getHeader("content-disposition");
    	String[] items=cd.split(";");
    	for(String string : items)
    	{
    		if(string.trim().startsWith("filename"))
    		{
    			return string.substring(string.indexOf("=") + 2, string.length()-1);
    		}
    	}
    	return "";
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("showuser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			User user=new RegisterDao().verifyLogin(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		}
		
		else if(action.equals("edituser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			User user=new RegisterDao().verifyLogin(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("editprofile.jsp").forward(request, response);
		}
		else if(action.equals("deleteuser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			int x=new RegisterDao().deleteUser(id);
			request.setAttribute("msg", "Record Deleted...");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println(1);
		User user=new User();
		System.out.println(2);
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setFirstname(request.getParameter("firstname"));
		user.setLastname(request.getParameter("lastname"));
		user.setEmail(request.getParameter("email"));
		user.setMobile(request.getParameter("mobile"));
		user.setPassword(request.getParameter("password"));
		user.setGender(request.getParameter("gender"));
		
		String savePath="D:\\Arjun\\JAVA\\Module 5 Assignment\\M5 Q4\\src\\main\\webapp\\images";
		File fileSaveDir = new File(savePath);
		if(!fileSaveDir.exists())
		{
			fileSaveDir.mkdir();
		}
		Part file=request.getPart("image");
		String fileName= extractfilename(file);
		file.write(savePath + File.separator + fileName);
		
		user.setImage(fileName);
		int x=new RegisterDao().updateUser(user);
		if(x>0)
		{
			
			response.sendRedirect("HomeController?action=showuser&id="+user.getId());
			
		}
	}

}
