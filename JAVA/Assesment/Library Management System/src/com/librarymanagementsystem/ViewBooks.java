package com.librarymanagementsystem;

import java.util.ArrayList;
import java.util.Iterator;

public class ViewBooks 
{
	public void viewBooks()
	{
		ArrayList<Books> a1 = new ArrayList<>();
//		if(a1.isEmpty())
//		{
//			System.out.println("No Books Found....");
//			return;
//		}
		Books b1 = new Books();
		a1.add(b1);
		System.out.println("List of Books: ");
		a1.getClass(AddBooks);
		Iterator<Books> i1= a1.iterator();
		while(i1.hasNext())
		{
			b1=i1.next();
			System.out.println("Category: "+b1.getCategory());
			System.out.println("Book ID: "+b1.getBid());
			System.out.println("Book Name: "+b1.getBname());
			System.out.println("Author: "+b1.getAuthor());
			System.out.println("Quantity: "+b1.getQuantity());
			System.out.println("Price: "+b1.getPrice());
		}
	}
}
