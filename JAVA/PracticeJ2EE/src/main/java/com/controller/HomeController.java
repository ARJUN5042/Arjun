package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.UserDao;
import com.model.User;

/**
 * Servlet implementation class HomeController
 */
@MultipartConfig(fileSizeThreshold = 1024*1024*512,
maxFileSize = 1024*1024*512, maxRequestSize = 1024*1024*512)

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
    			return string.substring(string.indexOf("=")+2, string.length()-1);
    		}
    	}
    	return "";
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("showuser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			User user=new UserDao().getLogin(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("Edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			User user=new UserDao().getLogin(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("edit.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("Update Data"))
		{
			User user=new User();
			user.setId(Integer.parseInt(request.getParameter("id")));
			user.setName(request.getParameter("name"));
			user.setAddress(request.getParameter("address"));
			user.setMobile(request.getParameter("mobile"));
			user.setGender(request.getParameter("gender"));
			
			String[] hobbiesArray=request.getParameterValues("hobbies");
			if(hobbiesArray != null)
			{
				List<String> hobbiesList=Arrays.asList(hobbiesArray);
				user.setHobbies(hobbiesList);
			}
			String savePath="C:\\Users\\Dell\\eclipse-workspace1\\PracticeJ2EE\\src\\main\\webapp\\image";
			File fileSaveDir = new File(savePath);
			if(!fileSaveDir.exists())
			{
				fileSaveDir.mkdir();
			}
			Part file=request.getPart("profilepic");
			String fileName=extractfilename(file);
			file.write(savePath + File.separator + fileName);
			user.setProfilepic(fileName);
			
			user.setEmail(request.getParameter("email"));
			user.setPassword(request.getParameter("password"));
			int x=new UserDao().update(user);
			if(x>0)
			{
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				System.out.println("update error");
			}
		}
		
		else if(action.equalsIgnoreCase("Delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			int x=new UserDao().delete(id);
			if(x>0)
			{
				response.sendRedirect("login.jsp");
			}
		}
	}

}
