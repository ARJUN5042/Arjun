package com.simple;
/*
      5
     45
    345
   2345
  12345
 */
public class Pyramid10 
{
	public static void main(String[] args) 
{
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
	}
}
}
