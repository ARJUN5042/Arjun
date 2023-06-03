package com.pk2;

import com.pk1.Car;

public class PackageDemo 
{
	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.setCid(123);
		c1.setCname("Ferrari");
		c1.setModel("GT");
		c1.setPrice(3000000);
		
		com.pk1.Car c2=new Car();
		c2.setCid(345);
		c2.setCname("M&M");
		c2.setModel("Scorpio");
		c2.setPrice(1500000);
		
		c1.display();
		c2.display();
	}
}
