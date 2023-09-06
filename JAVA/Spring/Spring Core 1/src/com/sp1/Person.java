package com.sp1;

public class Person 
{
	String pname;
	Phone phone;
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public void callPerson()
	{
		System.out.println("Pname is ... "+pname);
		phone.callPhone();
	}
	
}
