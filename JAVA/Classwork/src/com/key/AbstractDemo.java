package com.key;

abstract class ADemo
{
	int no;
	String name;
	public abstract void setData();
	public void show()
	{
		System.out.println("No is "+no);
		System.out.println("Name is "+name);
	}
}
abstract class Demo extends ADemo
{
	
}
class Demo1 extends Demo
{

	@Override
	public void setData()
	{
		// TODO Auto-generated method stub
		no=123;
		name="Rahul";
	}
	
}
public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		Demo1 a1=new Demo1();
		a1.setData();
		a1.show();
	}
}
