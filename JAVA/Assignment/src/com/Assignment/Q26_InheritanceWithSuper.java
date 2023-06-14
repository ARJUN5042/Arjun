package com.Assignment;
//create a super class
class Rectangle
{
	//initialize data members
	private double length;
	private double breadth;
	//creating parameterized constructor
	public Rectangle(double length, double breadth) 
	{
		this.length=length;
		this.breadth=breadth;
	}
	//creating method for area
	public double getArea()
	{
		return length*breadth;
	}
	//creating method for perimeter
	public double getPerimeter()
	{
		return 2*(length + breadth);
	}
}
//create sub class for super class
class Square extends Rectangle
{
	//create constructor for square for using parent class data member
	public Square(double side) 
	{
		super(side, side);
	}
}
public class Q26_InheritanceWithSuper 
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(4,5);//creating object for super class
		//calling method for area and perimeter
		System.out.println("Area of Rectangle: "+r1.getArea());
		System.out.println("Perimeter of Rectangle: "+r1.getPerimeter());
		
		Square s1=new Square(5);//creating object for sub class
		//calling method for area and perimeter
		System.out.println("\nArea of Square: "+s1.getArea());
		System.out.println("Perimeter of Square: "+s1.getPerimeter());
	}
}
