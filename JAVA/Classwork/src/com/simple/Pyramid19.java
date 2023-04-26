package com.simple;
/*
54321
 4321
  321
   21
    1
*/
public class Pyramid19 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
