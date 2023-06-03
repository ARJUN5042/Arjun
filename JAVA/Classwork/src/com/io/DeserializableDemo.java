package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializableDemo 
{
	public static void main(String[] args) 
	{
		Address address = DeserializableDemo.getDeserializedData();
		System.out.println(address);
	}
	public static Address getDeserializedData()
	{
		Address address=null;
		
		try 
		{
			FileInputStream fis=new FileInputStream("abc.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			address=(Address)ois.readObject();
			ois.close();
			fis.close();
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return address;
	}
}
