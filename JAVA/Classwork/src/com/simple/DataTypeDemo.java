package com.simple;

public class DataTypeDemo 
{
	public static void main(String[] args) 
	{
		int i1=52523;	//4 byte
		long l1=12345678;	//8 byte
		float f1=423.23f;	//4 byte
		double d1=3452523.34;	//8 byte
		byte b1=127;	//1 byte
		char c1='T';	//2 byte
		boolean bb=true;	//1 bit
		System.out.println("int is : "+i1);
		System.out.println("Long is : "+l1);
		System.out.println("Float is : "+f1);
		System.out.println("Double is : "+d1);
		System.out.println("Byte is : "+b1);
		System.out.println("Char is :"+c1);
		System.out.println("Boolean is : "+bb);
		System.out.println("");
		System.out.println("Interger byte is : "+Integer.BYTES+" Bytes.");
		System.out.println("Long byte is : "+Long.BYTES+" Bytes.");
		System.out.println("Float byte is : "+Float.BYTES+" Bytes.");
		System.out.println("Double byte is : "+Double.BYTES+" Bytes.");
		System.out.println("Byte byte is : "+Byte.BYTES+" Bytes.");		
	}
}
