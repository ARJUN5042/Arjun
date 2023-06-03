package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		
		HashSet h1=new HashSet();
		System.out.println("Default size is.. "+h1.size());
		System.out.println("Default value is.. "+h1);
		h1.add(123);
		h1.add('T');
		h1.add("Arjun");
		h1.add(new Integer(100));
		h1.add(78.65f);
		h1.add("Arjun");
		System.out.println("Now Size is.. "+h1.size());
		System.out.println("Now Value is.. "+h1);
		h1.remove("Arjun");
		System.out.println("Now Size is.. "+h1.size());
		System.out.println("Now Value is.. "+h1);
		h1.add("Tops");
		System.out.println("Now Size is.. "+h1.size());
		System.out.println("Now Value is.. "+h1);
		
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		h1.forEach(name->System.out.println(name));
		h1.forEach(System.out::println);
		for(Object o:h1)
		{
			System.out.println(o);
		}
	}
}
