package com.assignment;

public class Person 
{
	private int pid;
	private String pName;
	
	public Person()
	{
		pid=1;
		pName="Arjun";
	}
	
	public Person(int pid, String pName)
	{
		this.pid=pid;
		this.pName=pName;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pName=" + pName + "]";
	}
	
}
