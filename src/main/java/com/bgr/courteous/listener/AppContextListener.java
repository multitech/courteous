package com.bgr.courteous.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppContextListener implements ServletContextListener {


	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
    	System.out.println("-----------------------------");
    	System.out.println("-----------------------------");
    	System.out.println("Courteous - Startup");
    	System.out.println("-----------------------------");
    	System.out.println("-----------------------------");
    	
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
    	System.out.println("-----------------------------");
    	System.out.println("-----------------------------");
    	System.out.println("Courteous - Exit");
    	System.out.println("-----------------------------");
    	System.out.println("-----------------------------");
	}
	
}
