package com.Assignment;

import java.util.ArrayList;

public class Q48_ArraylistColors 
{
	public static void main(String[] args) 
	{
		//creating an arraylist and its object
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
	}
}
