package com.key;

class TDemo
{
	int no;
	String name;
	public void setData(int no, String name)
	{
		this.no=no;
		this.name=name;
	}
	public void show()
	{
		System.out.println("No is "+no);
		System.out.println("Name is "+name);
	}
}
public class ThisDemo 
{
	public static void main(String[] args) 
	{
		TDemo t1=new TDemo();
		t1.setData(123, "Arjun");
		t1.show();
	}
}
