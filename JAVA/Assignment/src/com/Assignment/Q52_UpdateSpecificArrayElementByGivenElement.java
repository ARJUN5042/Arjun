package com.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q52_UpdateSpecificArrayElementByGivenElement 
{
	public static void main(String[] args) 
	{
		//creating an arraylist
		ArrayList a1 = new ArrayList();
		//adding values
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		//display value
		System.out.println("ArrayList Before Update: "+a1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index you want to change...");
		int index = sc.nextInt();//user input for index
		
		System.out.println("Enter Element for that index...");
		String update = sc.next();//user input for element
		
		if(index >= 0 && index < a1.size())
		{
			a1.set(index, update);//using set method for updation
			System.out.println("Element at index "+index+" updated successfully.");
		}
		else
		{
			System.out.println("Invalid Index!");
		}
		
		System.out.println("ArrayList after Update: "+a1);
		
	}
}
