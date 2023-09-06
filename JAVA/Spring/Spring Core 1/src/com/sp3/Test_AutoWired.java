package com.sp3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_AutoWired 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sp3/autoWired.xml");
		Person pr1=(Person)context.getBean("pr1");
		pr1.callPerson();
	}
}
