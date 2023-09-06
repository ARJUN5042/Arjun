package com.sp3;

public class Person 
{
	private String pname;
	Phone phone;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Phone getPhone() {
		return phone;
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
