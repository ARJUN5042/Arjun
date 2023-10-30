package com.service;

import java.util.List;

import com.dao.MessageDao;
import com.model.Message;
import com.model.User;

public class MessageService 
{
	private MessageDao messageDao;
	
	public MessageService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageService(MessageDao messageDao) {
		super();
		this.messageDao = messageDao;
	}
	
	public boolean sendMessage(Message message)
	{
		return messageDao.sendMessage(message);
	}
	
	public List<Message> getMessageByUserId(int userid)
	{
		return messageDao.getMessageByUser(userid);
	}

	public List<Message> getMessagesForUser(Message message) {
		return messageDao.getMessageByUser(message);
	}
}
