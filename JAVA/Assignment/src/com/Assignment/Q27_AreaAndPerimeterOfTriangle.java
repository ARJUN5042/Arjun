package com.Assignment;

class Triangle
{
	//initialize data members as private
	private double side1;
	private double side2;
	private double side3;
	//creating constructor and initialize the values
	public Triangle()
	{
		side1=3;
		side2=4;
		side3=5;
	}
	//creating return type method for area
	public double getArea()
	{
		double s= (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s-side1)*(s-side2)*(s-side3));
	}
	//creating return type method for perimeter
	public double getPerimeter()
	{
		return (side1+side2+side3);
	}
}
public class Q27_AreaAndPerimeterOfTriangle 
{
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();//creating object of class
		//calling area and perimeter method
		System.out.println("Area of Triangle: "+t1.getArea());
		System.out.println("Perimeter of Triangle: "+t1.getPerimeter());
	}
}
