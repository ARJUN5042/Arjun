package com.th;

class Daemon2 extends Thread
{
	public void run()
	{
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	}
}
public class Daemon2Demo 
{
	public static void main(String[] args) 
	{
		Daemon2 d1=new Daemon2();
		Daemon2 d2=new Daemon2();		
		
		d1.start();
		d1.setDaemon(true);//that cause error
		d2.start();
	}
}
