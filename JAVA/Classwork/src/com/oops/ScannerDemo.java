package com.oops;

import java.util.Scanner;

public class ScannerDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A: ");
		int a = sc.nextInt();
		System.out.println("Enter B: ");
		int b = sc.nextInt();
		System.out.println("A + B: "+(a+b));
		sc.close();
	}
}
