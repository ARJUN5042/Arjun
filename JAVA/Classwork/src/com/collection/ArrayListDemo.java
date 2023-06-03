package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default size is.. "+a1.size());
		System.out.println("Default value is..."+a1);
		a1.add(123);
		a1.add('T');
		a1.add("Arjun");
		a1.add(45.65f);
		a1.add(new Integer(100));
		a1.add("Arjun");
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now value is..."+a1);
		a1.remove(1);
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now value is..."+a1);
		a1.remove("Arjun");
		System.out.println("Now size is.. "+a1.size());
		System.out.println("Now value is..."+a1);
		
//		Iterator i1=a1.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
		
//		a1.forEach(System.out::println);
//		a1.forEach(name->System.out.println(name));
		
		for(Object o:a1)
		{
			System.out.println(o);
		}
	}
}
