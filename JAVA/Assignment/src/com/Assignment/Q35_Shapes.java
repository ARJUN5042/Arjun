package com.Assignment;

class Shapes
{
	public void printShape()
	{
		System.out.println("This is a shape...");
	}
}
class Rectangle1 extends Shapes
{
	public void printRectangle()
	{
		System.out.println("This is a rectangular shape...");
	}
}
class Circle extends Shapes
{
	public void printCircle()
	{
		System.out.println("This is a circular shape...");
	}
}
class Square1 extends Rectangle1
{
	public void printSquare()
	{
		System.out.println("Square is a rectangle...");
	}
}
public class Q35_Shapes 
{
	public static void main(String[] args) 
	{
		Square1 s1 = new Square1();
		s1.printShape();
		s1.printRectangle();
	}
}
