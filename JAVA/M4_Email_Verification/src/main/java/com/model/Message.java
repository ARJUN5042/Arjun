package com.model;

import java.sql.Timestamp;

public class Message 
{
	private int mid,senderId,receiverId;
	private String messages;
	private Timestamp timestamp;
	
	public Message(int senderId, int receiverId, String messages) {
		super();
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.messages = messages;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getSenderId() {
		return senderId;
	}
	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}
	public int getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}
	public String getMessage() {
		return messages;
	}
	public void setMessage(String messages) {
		this.messages = messages;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Message(int mid, int senderId, int receiverId, String messages, Timestamp timestamp) {
		super();
		this.mid = mid;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.messages = messages;
		this.timestamp = timestamp;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
}
