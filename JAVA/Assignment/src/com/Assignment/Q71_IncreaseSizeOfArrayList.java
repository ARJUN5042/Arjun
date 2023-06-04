package com.Assignment;

import java.util.ArrayList;

public class Q71_IncreaseSizeOfArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<>();
		System.out.println("Default size is: "+a1.size());
		a1.add("Black");
		a1.add("White");
		a1.add("Green");
		System.out.println("ArrayList size is: "+a1.size());
		System.out.println("ArrayList is: "+a1);
		
		a1.ensureCapacity(6);
		a1.add("Blue");
		a1.add("Yellow");
		a1.add("Pink");
		System.out.println("ArrayList size is: "+a1.size());
		System.out.println("Now ArrayList is: "+a1);
	}
}
