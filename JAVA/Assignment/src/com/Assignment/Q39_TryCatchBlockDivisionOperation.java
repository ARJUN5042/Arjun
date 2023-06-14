package com.Assignment;

import java.util.Scanner;

public class Q39_TryCatchBlockDivisionOperation 
{
	public static void main(String[] args) 
	{
		//using try...catch block
		 try (Scanner scan = new Scanner(System.in)) 
		 {
			 //using nested try...catch block
	 			try 
	 			{
	 			    System.out.print("Enter the dividend: ");
	 			    int dividend = scan.nextInt();//taking user input

	 			    System.out.print("Enter the divisor: ");
	 			    int divisor = scan.nextInt();//taking user input

	 			    int quotient = dividend / divisor;
	 			    System.out.println("The quotient of " + dividend + " / " + divisor + " is: " + quotient);//display output
	 			    
	 			} 
	 			catch (ArithmeticException e) //catch block for arithmetic exception
	 			{
	 				System.out.println("Error: " + e.getMessage());
	 				e.printStackTrace();
	 			}
	 			catch (NumberFormatException e) //catch block for number format exception
	 			{
	 				System.out.println("Error: " + e.getMessage());
	 				System.out.println("Please enter valid numbers as command-line arguments.");
	 			}
	 			catch (Exception e) //catch block for other exception
	 			{
	 				System.out.println("Error: " + e.getMessage());
	 			}
		 }
	}
}