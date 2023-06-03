package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Q57_ShuffleElementsInArrayList 
{
	public static void main(String[] args) 
	{
ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		
		System.out.println("Original ArrayList is... "+a1);
		
		Collections.shuffle(a1);
		System.out.println("Shuffle ArrayList is... "+a1);
	}
}
