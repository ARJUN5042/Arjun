package com.Assignment;

import java.util.ArrayList;

public class Q67_JoinTwoArrayList 
{
	public static void main(String[] args) 
	{
		//creating an ArrayList and three objects
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		ArrayList<String> a3 = new ArrayList<String>();
		//adding values in first object
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		a1.add("Orange");
		a1.add("Kiwi");
		//adding values in second object
		a2.add("Pomegranate");
		a2.add("Mango");
		a2.add("Pineapple");
		a2.add("Grape");
		a2.add("Watermelon");
		//display size and values of both ArrayLists
		System.out.println("Size of ArrayList1 is: "+a1.size());
		System.out.println("ArrayList1 is: "+a1);
		System.out.println("Size of ArrayList2 is: "+a2.size());
		System.out.println("ArrayList2 is: "+a2);
		//adding values in third object
		a3.addAll(a1);
		a3.addAll(a2);

		System.out.println();
		//display after join two ArrayLists
		System.out.println("Join ArrayList size is: "+a3.size());
		System.out.println("After Join Both ArrayList is: "+a3);		
	}
}
