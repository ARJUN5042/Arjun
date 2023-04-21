package com.simple;

/*

++		=>		<,<=
--		=>		>,>=


12345
12345
12345
12345
12345

 */
public class Piramids 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++)//row
		{
			for(j=1;j<=5;j++)//column
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
