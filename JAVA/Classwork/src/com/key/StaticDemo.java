package com.key;

class SDemo
{
	int no;//non static variable
	static int sno;//static variable
	
	static class SDemo1
	{		
		public static void show()
		{
			sno=200;
			System.out.println("Sno is... "+sno);
		}
	}
	static
	{
		sno=4321;
		System.out.println("Static block is... "+sno);
	}
}
public class StaticDemo 
{
	public static void main(String[] args) 
	{
		SDemo.SDemo1.show();
		SDemo s1=new SDemo();
		SDemo s2=new SDemo();
		SDemo s3=new SDemo();
		
		s1.no=10;
		s2.no=20;
		s3.no=30;
		System.out.println("S1 is ... "+s1.no);
		System.out.println("S2 is ... "+s2.no);
		System.out.println("S3 is ... "+s3.no);
		
		s1.sno=10;
		s2.sno=20;
		s3.sno=30;		
		System.out.println("S1 is ... "+s1.sno);
		System.out.println("S2 is ... "+s2.sno);
		System.out.println("S3 is ... "+s3.sno);
	}
}
