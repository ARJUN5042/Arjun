package com.Assignment;

import java.util.ArrayList;

public class Q50_InsertAnElementInFirstPosition 
{
	public static void main(String[] args) 
	{
		//creating an arraylist
		ArrayList a1 = new ArrayList();
		//display default size and value
		System.out.println("Default Size is... "+a1.size());
		System.out.println("Default Value is... "+a1);
		//adding values
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		a1.add("Green");
		//display current size and value
		System.out.println("Now Size is... "+a1.size());
		System.out.println("Now Value is... "+a1);
		//adding new value at specific index
		a1.add(0, "Purple");
		//display latest size and value
		System.out.println("Now Size is... "+a1.size());
		System.out.println("After Adding An Element At First Position...");
		System.out.println("Now Value is... "+a1);
	}
}
