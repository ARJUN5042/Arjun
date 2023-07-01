package com.servlet1;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletListnerDemo implements ServletContextListener {
    public ServletListnerDemo() {
    }
    public void contextDestroyed(ServletContextEvent arg0)  
    { 
         System.out.println("Now ServletContext is Destroyed...");
    }
    public void contextInitialized(ServletContextEvent arg0)  
    {
    	System.out.println("Now ServletContext is Initialized...");
    }
	
}
