package com.simple;
/*
*****
****
***
**
*
**
***
****
*****
*/
public class Pyramid16 
{
	public static void main(String[] args) 
	{
		int n=1;
		for(int i=n;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n+1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

