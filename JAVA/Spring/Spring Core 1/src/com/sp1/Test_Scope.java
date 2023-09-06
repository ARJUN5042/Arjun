package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Scope 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer c1=(Customer)context.getBean("c1");
		c1.setData();
		c1.display();
		Customer c2=(Customer)context.getBean("c1");
		c2.setData();
		c2.display();
		Customer c3=(Customer)context.getBean("c1");
		c3.setCid(2);
		c3.setCname("Ankita");
		c2.display();
	}
}
