package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Message;
import com.model.User;
import com.service.MessageService;
import com.service.UserService;

@WebServlet("/message")
public class MessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private MessageService messageService;
       private UserService userService;
    public MessageController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	messageService = new MessageService();
    	userService = new UserService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		User user=(User)request.getSession().getAttribute("user");
		
		List<Message> messages=messageService.getMessagesForUser(user);
		
		request.setAttribute("messages", messages);
		request.getRequestDispatcher("/messaging.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		User sender = (User)request.getSession().getAttribute("user");
		
		String recipientEmail=request.getParameter("recipientEmail");
		
		User recipient = userService.getUserByEmail(recipientEmail);
		
		String messages = request.getParameter("messages");
		
		Message message = new Message(sender.getUid(),recipient.getUid(),messages);
		
		messageService.sendMessage(message);
		
		response.sendRedirect("/messages");
	}

}
