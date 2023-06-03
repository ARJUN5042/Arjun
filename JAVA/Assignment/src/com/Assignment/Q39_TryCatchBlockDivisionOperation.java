package com.Assignment;

import java.util.Scanner;

public class Q39_TryCatchBlockDivisionOperation 
{
	public static void main(String[] args) 
	{
		 try (Scanner scan = new Scanner(System.in)) 
		 {
	 			try 
	 			{
	 			    System.out.print("Enter the dividend: ");
	 			    int dividend = scan.nextInt();

	 			    System.out.print("Enter the divisor: ");
	 			    int divisor = scan.nextInt();

	 			    int quotient = dividend / divisor;
	 			    System.out.println("The quotient of " + dividend + " / " + divisor + " is: " + quotient);
	 			    
	 			} 
	 			catch (ArithmeticException e) 
	 			{
	 				System.out.println("Error: " + e.getMessage());
	 				e.printStackTrace();
	 			}
	 			catch (NumberFormatException e) 
	 			{
	 				System.out.println("Error: " + e.getMessage());
	 				System.out.println("Please enter valid numbers as command-line arguments.");
	 			}
	 			catch (Exception e) 
	 			{
	 				System.out.println("Error: " + e.getMessage());
	 			}
		 }
	}
}