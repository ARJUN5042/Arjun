package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo 
{
	public static void main(String[] args) 
	{
		SerializableDemo s1=new SerializableDemo();
		s1.setSerializedData();
	}
	public void setSerializedData()
	{
		Address address=new Address();
		address.setCountry("India");
		address.setState("Gujarat");
		address.setCity("Ahmedabad");
		
		try 
		{
			FileOutputStream fos=new FileOutputStream("abc.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(address);
			oos.flush();
			fos.flush();
			fos.close();
			System.out.println("Data Write");
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
