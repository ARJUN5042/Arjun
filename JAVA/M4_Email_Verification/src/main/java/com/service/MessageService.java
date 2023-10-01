package com.service;

import java.util.List;

import com.dao.MessageDao;
import com.model.Message;

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
}
