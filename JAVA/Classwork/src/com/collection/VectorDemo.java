package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector(2,1);
		System.out.println("Default size is.. "+v1.size());
		System.out.println("Default Capacity.. "+v1.capacity());
		System.out.println("Default value is..."+v1);
		v1.add(123);
		v1.add('T');
		v1.add("Arjun");
		v1.add(45.65f);
		v1.add(new Integer(100));
		v1.add("Arjun");
		System.out.println("Now size is.. "+v1.size());
		System.out.println("Now Capacity.. "+v1.capacity());
		System.out.println("Now value is..."+v1);
		v1.remove(2);
		System.out.println("Now size is.. "+v1.size());
		System.out.println("Now Capacity.. "+v1.capacity());
		//capacity not change and reserving memory(waste of memory)
		System.out.println("Now value is..."+v1);
		
		Enumeration e1 = v1.elements();
		while (e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}
}
