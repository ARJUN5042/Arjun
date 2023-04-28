package com.oops;

import java.util.Scanner;

public class ScannerDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Full Name: ");
		sc.nextLine();
//		String name = sc.next();
		String name = sc.nextLine();
//		String name = sc1.nextLine();
		System.out.println("Your Number is: "+a);
		System.out.println("Your name is: "+name);
		sc.close();
	}
}
