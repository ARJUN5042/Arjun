package com.mainpk;

import com.pk1.Car;

public class PackageDemo1 
{
	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.setCid(111);
		c1.setCname("Maruti");
		c1.setModel("Maruti 800");
		c1.setPrice(80000);
		
		com.pk2.Car c2=new com.pk2.Car();
		c2.setCid(999);
		c2.setCname("Hyndai");
		c2.setModel("CRETA");
		c2.setPrice(1300000);
		
		c1.display();
		c2.display();
	}
}
