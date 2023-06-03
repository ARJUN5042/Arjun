package com.Assignment;

class Rectangle
{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) 
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea()
	{
		return length*breadth;
	}
	public double getPerimeter()
	{
		return 2*(length + breadth);
	}
}
class Square extends Rectangle
{
	public Square(double side) 
	{
		super(side, side);
	}
}
public class Q26_InheritanceWithSuper 
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(4,5);
		System.out.println("Area of Rectangle: "+r1.getArea());
		System.out.println("Perimeter of Rectangle: "+r1.getPerimeter());
		
		Square s1=new Square(5);
		System.out.println("\nArea of Square: "+s1.getArea());
		System.out.println("Perimeter of Square: "+s1.getPerimeter());
	}
}
