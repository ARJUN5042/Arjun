package com.key;

final class FDemo//now can not make sub class for this class
{
	final int no=100;//final keyword 
	String name;
	public final void setData()//create final method
	{
//		no=123;//not let value to be changed
		name="Rahul";
	}
	public void show()
	{
		System.out.println("No is "+no);
		System.out.println("Name is "+name);
	}
}

public class FinalDemo 
{
	public static void main(String[] args) 
	{
		FDemo f1=new FDemo();
		f1.setData();
		f1.show();
	}
}
