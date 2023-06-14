package com.Assignment;

class PrintNumberAndChar
{
	//creating same method name but arguments are different
	public void print(int n, char c)
	{
		System.out.println("Number is: "+n+" , And Character is: "+c);
	}
	public void print(char c, int n)
	{
		System.out.println("Character is: "+c+" , And Number is: "+n);
	}
}
public class Q22_PrintCharAndNumberWithSameNameMethods 
{
	public static void main(String[] args) 
	{
		PrintNumberAndChar p1=new PrintNumberAndChar();
		p1.print(123, 'A');
		p1.print('B', 555);
	}
}
