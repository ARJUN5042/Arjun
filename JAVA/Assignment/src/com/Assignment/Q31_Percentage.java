package com.Assignment;
//creating abstract class
abstract class Marks
{
	//creating abstract method so do not specify the body part
	public abstract double getPercentage();
}
//creating subclass of super class
class A extends Marks
{
	//initialize the data member
	private int m1,m2,m3;
	//creating parameterized constructor
	public A(int m1, int m2, int m3) 
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	//specify body part of super class method via overriding
	public double getPercentage()
	{
		return (m1+m2+m3)/3.0;
	}
}
//creating sub class
class B extends Marks
{
	//initialize data members
	private int m1,m2,m3,m4;
	//create parameterized constructor
	public B(int m1, int m2, int m3, int m4) 
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	
	public double getPercentage()
	{
		return (m1+m2+m3+m4)/4;
	}
	
}
public class Q31_Percentage 
{
	public static void main(String[] args) 
	{
		A a = new A(80, 85, 95);
		B b = new B(70, 80, 85, 90);
		System.out.println("Percentage of marks obtained by A: "+a.getPercentage());
		System.out.println("Percentage of marks obtained by B: "+b.getPercentage());
	}
}
