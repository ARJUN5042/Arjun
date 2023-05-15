package com.key;

interface Sport
{
	String spname="Badminton";
}
public interface Student extends Sport
{
	int sid=1;
	String sname="Ankita";
	public static void show()
	{
		System.out.println("Sid is... "+sid);
		System.out.println("Sname is... "+sname);
		System.out.println("Spname is... "+spname);
	}
}
