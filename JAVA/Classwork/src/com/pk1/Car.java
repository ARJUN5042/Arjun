package com.pk1;

public class Car 
{
	int cid,price;
	String cname,model;
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void display()
	{
		System.out.println("Cid is "+cid);
		System.out.println("Cname is "+cname);
		System.out.println("Cmodel is "+model);
		System.out.println("Price is "+price);
	}
}
