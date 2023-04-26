package com.Assignment;

public class Q7_PatternRightTriangle 
{
	public static void main(String[] args) 
	{
		int n = 1;//Initializing variable with value for pattern
		for(int i=1;i<=4;i++)//Using for loop for making Pattern
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+n);
				n++;//Incrementing value of variable
			}
			System.out.println();
		}
	}
}
