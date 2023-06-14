package com.Assignment;
//creating super class
class Shapes
{
	//creating method
	public void printShape()
	{
		System.out.println("This is a shape...");
	}
}
//creating sub class
class Rectangle1 extends Shapes
{
	//creating method
	public void printRectangle()
	{
		System.out.println("This is a rectangular shape...");
	}
}
//creating sub class
class Circle extends Shapes
{
	//creating method
	public void printCircle()
	{
		System.out.println("This is a circular shape...");
	}
}
//creating sub class
class Square1 extends Rectangle1
{
	//creating method
	public void printSquare()
	{
		System.out.println("Square is a rectangle...");
	}
}
public class Q35_Shapes 
{
	public static void main(String[] args) 
	{
		Square1 s1 = new Square1();//creating latest sub class object
		s1.printShape();//calling method
		s1.printRectangle();//calling method
	}
}
