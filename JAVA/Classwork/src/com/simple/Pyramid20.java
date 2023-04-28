package com.simple;
/*
1
11
121
1331
14641
*/
public class Pyramid20 
{
	public static void main(String[] args) 
	{
		//if we saw pattern, each number multiply by 11 with above number
		int n=1;
		for(int i=1;i<=5;i++)
		{
			System.out.println(n);
			n=n*11;
		}	
	}
}
