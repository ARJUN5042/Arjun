package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_DI_Const 
{
	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Person1 pr2=(Person1)context.getBean("pr2");
		pr2.callPerson();
	}
}
