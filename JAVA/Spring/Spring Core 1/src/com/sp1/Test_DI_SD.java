package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_DI_SD 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Person pr1=(Person)context.getBean("pr1");
		pr1.callPerson();
	}
}
