package com.Assignment;

class CalculateArea
{
	//creating both method with same name
	public void Area(int side)
	{
		int area = side * side;
		System.out.println("Area of Square: "+area);
	}
	public void Area(int length, int breadth)
	{
		int area = length * breadth;
		System.out.println("Area of Rectangle: "+area);
	}
}
public class Q23_FindArea 
{
	public static void main(String[] args) 
	{
		CalculateArea c1=new CalculateArea();
		c1.Area(5);
		c1.Area(7, 8);
	}
}
