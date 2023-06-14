package com.Assignment;

class PrintNumber
{
	//declaring all methods with same name but different data types
	public void printn(int n)
	{
		System.out.println("Integer Datatype: "+n);
	}
	public void printn(float n)
	{
		System.out.println("Float Datatype: "+n);
	}
	public void printn(short n)
	{
		System.out.println("Short Datatype: "+n);
	}
	public void printn(byte n)
	{
		System.out.println("Byte Datatype: "+n);
	}
	public void printn(long n)
	{
		System.out.println("Long Datatype: "+n);
	}
	public void printn(double n)
	{
		System.out.println("Double Datatype: "+n);
	}
	public void printn(char n)
	{
		System.out.println("Char Datatype: "+n);
	}
	public void printn(boolean n)
	{
		System.out.println("Boolean Datatype: "+n);
	}
}
public class Q21_DatatypesUsingMethodOverloading 
{
	public static void main(String[] args) 
	{
		PrintNumber p1= new PrintNumber();
		p1.printn(10);
		p1.printn(23.4f);
		p1.printn((short)2222);
		p1.printn((byte)111);
		p1.printn(1234567890L);
		p1.printn(1234567.12);
		p1.printn('A');
		p1.printn(true);
	}
}
