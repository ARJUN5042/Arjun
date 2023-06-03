package com.collection;

import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		System.out.println("Default size is.. "+l1.size());
		System.out.println("Default value is..."+l1);
		l1.add(123);
		l1.add('T');
		l1.add("Arjun");
		l1.add(45.65f);
		l1.add(new Integer(100));
		l1.add("Arjun");
		System.out.println("Now size is.. "+l1.size());
		System.out.println("Now value is..."+l1);
		l1.addFirst("Hii");
		l1.addLast("Arjun");
		System.out.println("Now size is.. "+l1.size());
		System.out.println("Now value is..."+l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println("Now size is.. "+l1.size());
		System.out.println("Now value is..."+l1);
	}
}
