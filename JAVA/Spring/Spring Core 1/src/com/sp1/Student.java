package com.sp1;

public class Student 
{
	private int sid;
	private String sname,degree,country,address,city;
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void halfDisplay()
	{
		System.out.println("Sid is ... "+sid);
		System.out.println("SName is ... "+sname);
		System.out.println("Degree is ... "+degree);
	}
	public void fullDisplay()
	{
		System.out.println("Sid is ... "+sid);
		System.out.println("SName is ... "+sname);
		System.out.println("Degree is ... "+degree);
		System.out.println("Country is ... "+country);
		System.out.println("Address is ... "+address);
		System.out.println("City is ... "+city);
	}
}
