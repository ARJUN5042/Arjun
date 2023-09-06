package com.sp1;

public class Message 
{
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void ankita()
	{
		System.out.println("Initialized is called via Ankita...");
	}
	public void arjun()
	{
		System.out.println("Destroyed is called via Arjun");
	}
}
