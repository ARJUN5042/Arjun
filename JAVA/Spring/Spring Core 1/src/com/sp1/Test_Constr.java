package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Constr 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=(Employee)context.getBean("e1");
		e1.display();
		Employee e2=(Employee)context.getBean("e2");
		e2.display();
	}
	
}
