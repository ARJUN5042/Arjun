package com.th;

public class StaticThreadDemo 
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		t1.setName("Arjun");
		System.out.println(t1);
//		t1.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1);
		System.out.println("Thread is alive or not... "+t1.isAlive());
	}
}
