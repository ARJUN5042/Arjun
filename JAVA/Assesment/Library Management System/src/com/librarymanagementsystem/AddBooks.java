package com.librarymanagementsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddBooks 
{
	public void addBooks()
	{
		ArrayList<Books> a1 = new ArrayList<>();
		System.out.println("====Select Categories====");
		System.out.println("-->1. Computer");
		System.out.println("-->2. Electronics");
		System.out.println("-->3. Electrical");
		System.out.println("-->4. Civil");
		System.out.println("-->5. Mechanical");
		System.out.println("-->6. Architecture");
		System.out.println("-->7. Back to main menu");
		System.out.println("==============================");
		String category;
		System.out.println("Enter Your Choice: ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("Enter the Information Below");
		switch(choice)
		{
		case 1:
			category = "Computer";
			break;
		case 2:
			category = "Electronics";
			break;
		case 3:
			category = "Electrical";
			break;
		case 4:
			category = "Civil";
			break;
		case 5:
			category = "Mechanical";
			break;
		case 6:
			category = "Architecture";
			break;
		case 7:
			System.out.println("Back to Main Menu");
			MainMenu mainmenu=new MainMenu();
			break;
		}
		Books b1=new Books();
		System.out.print("Category: ");
		b1.setCategory(sc.next());
		System.out.print("Book ID: ");
		b1.setBid(sc.nextInt());
		System.out.print("Book Name: ");
		b1.setBname(sc.next());
		System.out.print("Author: ");
		b1.setAuthor(sc.next());
		System.out.print("Quantity: ");
		b1.setQuantity(sc.nextInt());
		System.out.print("Price: ");
		b1.setPrice(sc.next());
		a1.add(b1);
		List<Books> getList()
		{
			return list;
		}
//		System.out.println("Book values: "+a1);
		
//		Iterator<Books> i1= a1.iterator();
//		while(i1.hasNext())
//		{
//			Books b=i1.next();
//			System.out.println("Category: "+b.getCategory());
//			System.out.println("Book ID: "+b.getBid());
//			System.out.println("Book Name: "+b.getBname());
//			System.out.println("Author: "+b.getAuthor());
//			System.out.println("Quantity: "+b.getQuantity());
//			System.out.println("Price: "+b.getPrice());
//		}
	}
}
