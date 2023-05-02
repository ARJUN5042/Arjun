package com.oops;

import java.util.Scanner;

public class JaggedArrayDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");
		int r=sc.nextInt();
		
		int[][] a=new int[r][];
		
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter Value for a["+i+"] Column = ");
			a[i]=new int[sc.nextInt()];
		}
		for(int i=0;i<r;i++)
		{
			System.out.println("Row is "+(i+1));
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter Value... ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
