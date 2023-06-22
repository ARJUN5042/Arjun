package com.librarymanagementsystem;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		MainMenu mainmenu= new MainMenu();
		AddBooks addbooks = new AddBooks();
		ViewBooks viewbooks = new ViewBooks();
		String password = "123";
		System.out.print("Enter password: ");
		Scanner sc=new Scanner(System.in);
		String inputpass=sc.next();
		if(inputpass.equals(password))
		{
			System.out.println("Access Granted....");
			int input;
			do
			{
				mainmenu.menu();
				System.out.println("Enter your choice: ");
				input = sc.nextInt();
				switch(input)
				{
				case 1:
					System.out.println("Add Books");
					addbooks.addBooks();
					break;
				case 2:
					System.out.println("Delete Book");
					break;
				case 3:
					System.out.println("Search Book");
					break;
				case 4:
					System.out.println("View Book List");
					viewbooks.viewBooks();
					break;
				case 5:
					System.out.println("Edit Book Record");
					break;
				case 6:
					System.out.println("Change Password");
					break;
				case 7:
					System.out.println("Closing Application.....");
					try
					{
						Thread.sleep(3000);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
					break;
				default:
					System.out.println("Invalid Input!!!!!");
					break;
				}
			}
			while(input !=7);
		}
		else
		{
			System.out.println("Password is Incorrect...");
		}
	}
}