package com.sp2;

public class Person 
{
	private int pid;
	private String pname,city;
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", city=" + city + "]";
	}
	
}
