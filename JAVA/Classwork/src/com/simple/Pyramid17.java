package com.simple;
/*
*****
****
***
**
*
*
**
***
****
*****
*/
public class Pyramid17 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
//		int i,j;
//		do
//		{
//			for(i=1;i<=5;i++)
//			{
//				for(j=5;j>=i;j--)
//				{
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
//		while(i<5);
//		{
//			for(i=1;i<=5;i++)
//			{
//				for(j=1;j<=i;j++)
//				{
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
	}
}
