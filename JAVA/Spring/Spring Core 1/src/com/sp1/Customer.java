package com.sp1;

public class Customer 
{
	private int cid;
	private String cname;
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setData()
	{
		cid=1;
		cname="Arjun";
	}
	public void display()
	{
		System.out.println("Cid is ... "+cid);
		System.out.println("Cname is ... "+cname);
	}
}
