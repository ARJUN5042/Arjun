package com.simple;
/*
Do...While
------------
initialization
Do
{
	statements;
	inc/dec operator;
}
while(condition);
 */
public class DoWhileDemo 
{
	public static void main(String[] args) 
	{
		int i=1;//initialization
		do
		{
			System.out.print(" "+i);//statements
			i++;
		}
		while(i<=5);//condition
	}
	//in the backend side how much line of code execute: 21 line
}
