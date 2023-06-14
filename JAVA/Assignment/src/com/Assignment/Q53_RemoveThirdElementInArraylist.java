package com.Assignment;

import java.util.ArrayList;

public class Q53_RemoveThirdElementInArraylist 
{
	public static void main(String[] args) 
	{
		//creating an arraylist
		ArrayList a1 = new ArrayList();
		//adding values
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		//display arraylist
		System.out.println("ArrayList is... "+a1);
		//remove element of specific index
		a1.remove(2);
		//display current value
		System.out.println("After Removing Third Element of Arraylist....");
		System.out.println("Now Arraylist is... "+a1);
		
	}
}
