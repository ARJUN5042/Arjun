package com.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q52_UpdateSpecificArrayElementByGivenElement 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		
		System.out.println("ArrayList Before Update: "+a1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index you want to change...");
		int index = sc.nextInt();
		
		System.out.println("Enter Element for that index...");
		String update = sc.next();
		
		if(index >= 0 && index < a1.size())
		{
			a1.set(index, update);
			System.out.println("Element at index "+index+" updated successfully.");
		}
		else
		{
			System.out.println("Invalid Index!");
		}
		
		System.out.println("ArrayList after Update: "+a1);
		
	}
}
