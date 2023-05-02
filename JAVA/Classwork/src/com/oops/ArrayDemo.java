package com.oops;

import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		//int a[];//declaration of array
		int[] a=new int[5];
//		for(int i=0;i<5;i++)
//		{
//			a[i]=i+1;//if here to store value which is i
//			System.out.println(a[i]);
//		}
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Elements: ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}
}
