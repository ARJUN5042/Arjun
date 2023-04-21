package com.simple;

public class TypeConverisonDemo 
{
	public static void main(String[] args) 
	{
		int i=10;//4 byte
		long l;//8 byte
		
		l=i;//implicit
		System.out.println("Implicit is... "+l);
		
		int x;//4 byte
		x=(int)l;//type casting(explicit)
		System.out.println("Explicit is... "+x);
		
		int a=123;//4 byte
		byte b;//1 byte
		b=(byte)a;
		System.out.println("Byte is... "+b);
	}
}
