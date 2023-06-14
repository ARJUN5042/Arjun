package com.Assignment;

import java.util.ArrayList;

public class Q63_ReverseElementsinArrayList 
{
	public static void main(String[] args) 
	{
		//creating an ArrayList
		ArrayList<String> a1= new ArrayList<String>();
		System.out.println("Default value is... "+a1);
		//adding values
		a1.add("Black");
		a1.add("Blue");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("White");
		//display current size and values
		System.out.println("Now Size is... "+a1.size());
		System.out.println("Now Value is... "+a1);
		
		int size = a1.size();
		//using for loop for separate elements and reverse them
		for(int i=0;i<size/2;i++)
		{
			String reverse = a1.get(i);
			a1.set(i, a1.get(size -i -1));
			a1.set(size -i -1, reverse);
		}
		System.out.println("Reverse ArrayList is... "+a1);
	}
}
