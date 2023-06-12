package com.Assignment;

public class Q13_PrintNumbersWhichDivisibleBy3and5OrBoth 
{
	public static void main(String[] args) 
	{
		//get numbers which are divisible by 3
		System.out.println("Numbers divisible by 3: ");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println();
		//get numbers which are divisible by 5
		System.out.println("Numbers divisible by 5: ");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println();
		//get numbers which are divisible by 3 and 5
		System.out.println("Numbers divisible by 3 and 5: ");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
