package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Q66_SwapTwoElementsInArrayList 
{
	public static void main(String[] args) 
	{
		//creating an ArrayList
		ArrayList<String> a1 = new ArrayList<String>();
		//adding values
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		a1.add("Orange");
		a1.add("Kiwi");
		//display ArrayList
		System.out.println("Arraylist Before Swap: "+a1);
		//using collections for swap elements
		Collections.swap(a1, 1, 4);
		//display ArrayList after swapping
		System.out.println("ArrayList After Swap: "+a1);
	}
}
