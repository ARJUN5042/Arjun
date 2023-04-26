package com.simple;
/*
a
ab
abc
abcd
abcde 
*/
public class Pyramid18 
{
	public static void main(String[] args) 
	{
		for(int i=97;i<=101;i++)
		{
			for(int j=97;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
		for(char i=97;i<=101;i++)
		{
			for(char j=97;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
