package com.Assignment;

import java.util.ArrayList;

public class Q72_ReplaceSecondElementofArrayList 
{
	public static void main(String[] args) 
	{
		//creating an ArrayList
		ArrayList<String> a1 = new ArrayList<String>();
		//adding values
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		//display values
		System.out.println("Original ArrayList is: "+a1);
		//making condition for ArrayList size is enough to replace element at specific index
		if(a1.size()>=2)
		{
			a1.set(1, "Orange");
		}
		//display current ArrayList after replace element
		System.out.println("After Replacing Second Element ArrayList is: "+a1);
	}
}
