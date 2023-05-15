package com.oops;

class Parent
{
	String pname;
	public void setParentData()
	{
		pname=" Kantibhai Hirpara";
	}
}
class Child1 extends Parent
{
	String cname;
	public void setChildData()
	{
		cname="Arjun";
	}
	public void showData()
	{
		System.out.println(cname+pname);
	}
}
class Child2 extends Parent
{
	String cname;
	public void setChildData()
	{
		cname="Sanjay";
	}
	public void showData()
	{
		System.out.println(cname+pname);
	}
}
public class HierarchicalDemo 
{
	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		c1.setParentData();
		c1.setChildData();
		c1.showData();
		
		Child2 c2=new Child2();
		c2.setParentData();
		c2.setChildData();
		c2.showData();
	}
}
