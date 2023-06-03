package com.io;

import java.io.File;
import java.io.IOException;

class FDemo
{
	File file;
	public FDemo()
	{
		file=new File("a3.txt");
		try {
			file.createNewFile();
			display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void display()
	{
		System.out.println("is directory or not    "+file.isDirectory());
		System.out.println("is File or not   "+file.isFile());
		System.out.println("can i read the file or not   "+file.canRead());
		System.out.println("can i write into the file or not   "+file.canWrite());
		System.out.println("can i execute into the file or not   "+file.canExecute());
		System.out.println("name of the file is   "+file.getName());
		System.out.println("Current path is   "+file.getPath());
		System.out.println("Full path is   "+file.getAbsolutePath());
	}
}
public class FileDemo 
{
	public static void main(String[] args) 
	{
		new FDemo();
	}
}
