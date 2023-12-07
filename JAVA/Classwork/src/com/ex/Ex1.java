package com.ex;

public class Ex1 
{
	public static void main(String[] args) 
	{
		try
		{
			int x=10/0;
			System.out.println("x : "+x);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("A Exception");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}
}
