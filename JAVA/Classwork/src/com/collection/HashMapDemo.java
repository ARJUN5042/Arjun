package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		System.out.println("Default Size is.. "+h1.size());
		System.out.println("Default Value is.. "+h1);
		h1.put(1, "Arjun");
		h1.put(2, "Rockey");
		h1.put("Arjun", "Hirpara");
		h1.put(78.65f, new Integer(100));
		System.out.println("Now Size is.. "+h1.size());
		System.out.println("Now Value is.. "+h1);
		h1.remove(1);
		System.out.println("Now Size is.. "+h1.size());
		System.out.println("Now Value is.. "+h1);
		
		//seperating key and value
		Set set=h1.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
			Map.Entry me=(Map.Entry)i1.next();
			System.out.println("Key is.. "+me.getKey());
			System.out.println("Value is.. "+me.getValue());
			System.out.println();
			
			String[] s=i1.next().toString().split("=");
			System.out.println("Key is.. "+s[0]);
			System.out.println("Value is.. "+s[1]);
			System.out.println();
		}
	}
}
