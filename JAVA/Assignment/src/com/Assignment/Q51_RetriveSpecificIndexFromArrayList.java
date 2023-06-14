package com.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q51_RetriveSpecificIndexFromArrayList 
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
		//using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index Number To Get Element: ");
        // Retrieve element from the specified index
        int index = sc.nextInt(); // Index of the element to retrieve
        if (index >= 0 && index < a1.size()) {
            String element = (String)a1.get(index);//using get(index) function to get index
            System.out.println("Element at index " + index + ": " + element);
        } 
        else 
        {
            System.out.println("Invalid index!");
        }
	}
}
