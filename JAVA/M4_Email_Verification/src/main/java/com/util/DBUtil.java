package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil 
{
	private static Connection connection;
	public DBUtil()
	{
		
	}
	
	public static Connection getConnection()
	{
		if(connection==null)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/email", "root", "");
				System.out.println("Connection Established......");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return connection;
	}
	public static void closeConnection()
	{
		if(connection!=null)
		{
			try
			{
				connection.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
