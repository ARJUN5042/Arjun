package com.simple;
/*
while:
--------
initialization
while(condition)
{
	statements
	inc/dec operator
}
 */
public class WhileDemo 
{
	public static void main(String[] args) 
	{
		int i=1;//initialization
		while(i<=5)//condition
		{
			System.out.print(" "+i);//statements
			i++;//i=i+1
		}
		//in the backend side how much line of code execute: 17 line
	}
}