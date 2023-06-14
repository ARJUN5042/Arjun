package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Q57_ShuffleElementsInArrayList 
{
	public static void main(String[] args) 
	{
		//creating an ArrayList
		ArrayList<String> a1 = new ArrayList<String>();
		//adding values
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		//display value
		System.out.println("Original ArrayList is... "+a1);
		//using collection package to shuffle elements
		Collections.shuffle(a1);
		//display values after shuffling elements
		System.out.println("Shuffle ArrayList is... "+a1);
	}
}
