package com.oops;

class Sum
{
	int x,y;
	public Sum()
	{
		x=10;
		y=20;
		System.out.println("First Sum is : "+(x+y));
	}
	public Sum(int a, int b)
	{
		x=a;
		y=b;
		System.out.println("Second Sum is : "+(x+y));
	}
}

public class COnstructorDemo 
{
	public static void main(String[] args) 
	{
		Sum s1=new Sum();//use memory for object
//		Sum s2=new Sum(25,35);
		new Sum(25,35);//use only constructor memory
		
	}
}
