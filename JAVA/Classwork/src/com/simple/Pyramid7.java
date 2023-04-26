package com.simple;
/*
1
10
101
1010
10101
 */
public class Pyramid7 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}
