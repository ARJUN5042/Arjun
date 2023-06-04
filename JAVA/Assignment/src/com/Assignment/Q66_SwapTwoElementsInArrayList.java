package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Q66_SwapTwoElementsInArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		a1.add("Orange");
		a1.add("Kiwi");
		
		System.out.println("Arraylist Before Swap: "+a1);
		
		Collections.swap(a1, 1, 4);
		
		System.out.println("ArrayList After Swap: "+a1);
	}
}
