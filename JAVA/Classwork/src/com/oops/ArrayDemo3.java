package com.oops;

import java.util.Scanner;

public class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Array A");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("Enter element ["+i+"]["+j+"]: ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Array B");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("Enter element ["+i+"]["+j+"]: ");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{					
				c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
