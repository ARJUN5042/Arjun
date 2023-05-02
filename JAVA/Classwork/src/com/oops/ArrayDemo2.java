package com.oops;

import java.util.Scanner;

public class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		int[][] a=new int[3][3];//to store 9 elements
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
//		int k=1;
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(k);
//				k++;
//			}
//			System.out.println();
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Array A...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("Enter Element ["+i+"]["+j+"]: ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Array B...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("Enter Element ["+i+"]["+j+"]: ");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Sum of Array A and B...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
