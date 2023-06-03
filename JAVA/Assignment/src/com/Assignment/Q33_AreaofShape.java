package com.Assignment;

abstract class Shape
{
	public abstract void rectangleArea(double length, double breadth);
	public abstract void squareArea(double side);
	public abstract void circleArea(double radius);
}
class Area extends Shape
{
	public void rectangleArea(double length, double breadth)
	{
		double rectangleArea = length * breadth;
		System.out.println("Area of Rectangle is: "+rectangleArea);
	}
	public void squareArea(double side)
	{
		double squareArea = side * side;
		System.out.println("Area of Square is: "+squareArea);
	}
	public void circleArea(double radius)
	{
		double circleArea = 3.14 * radius;
		System.out.println("Area of Circle is: "+circleArea);
	}
}
public class Q33_AreaofShape 
{
	public static void main(String[] args) 
	{
		Area a1=new Area();
		a1.rectangleArea(5, 4);
		a1.squareArea(5);
		a1.circleArea(2);
	}
}
