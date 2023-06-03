package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharacterStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw=new FileWriter("a2.txt",true);
			String s="Tops Technologies...";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("Data Write... ");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		try 
		{
			FileReader fr=new FileReader("a2.txt");
			int x;
			while((x=fr.read())!=-1)
			{
				System.out.print((char)x);
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
