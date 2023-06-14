package com.Assignment;

import java.util.ArrayList;

public class Q73_PositionOfElementsInArrayList 
{
	public static void main(String[] args) 
	{
		//creating an ArrayList
		ArrayList<String> a1 = new ArrayList<String>();
		//adding values
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Blue");
		a1.add("Yellow");
		a1.add("Green");
		a1.add("Purple");
		//display elements
		System.out.println("Arraylist is: "+a1);
		//using for loop to separate elements and get positions of each elements
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(i+" is... "+a1.get(i));
		}
	}
}
