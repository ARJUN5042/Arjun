package com.Assignment;

import java.util.ArrayList;

public class Q50_InsertAnElementInFirstPosition 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		System.out.println("Default Size is... "+a1.size());
		System.out.println("Default Value is... "+a1);
		
		a1.add("Black");
		a1.add("White");
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Blue");
		a1.add("Green");
		
		System.out.println("Now Size is... "+a1.size());
		System.out.println("Now Value is... "+a1);

		a1.add(0, "Purple");
		System.out.println("Now Size is... "+a1.size());
		System.out.println("After Adding An Element At First Position...");
		System.out.println("Now Value is... "+a1);
	}
}
