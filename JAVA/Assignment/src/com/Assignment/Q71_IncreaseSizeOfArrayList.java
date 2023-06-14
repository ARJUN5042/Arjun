package com.Assignment;

import java.util.ArrayList;

public class Q71_IncreaseSizeOfArrayList 
{
	public static void main(String[] args) 
	{
		//creating an ArrayList
		ArrayList<String> a1 = new ArrayList<>();
		//display current size
		System.out.println("Default size is: "+a1.size());
		//adding values
		a1.add("Black");
		a1.add("White");
		a1.add("Green");
		//display size and values
		System.out.println("ArrayList size is: "+a1.size());
		System.out.println("ArrayList is: "+a1);
		//ensureCapacity of ArrayList and adding some values 
		a1.ensureCapacity(6);
		a1.add("Blue");
		a1.add("Yellow");
		a1.add("Pink");
		//display current size and values
		System.out.println("ArrayList size is: "+a1.size());
		System.out.println("Now ArrayList is: "+a1);
	}
}
