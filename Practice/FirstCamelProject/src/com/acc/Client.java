package com.acc;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		PropertyConfigurator.configure("C:\\Users\\khoyendra.pande\\Development\\Workspace\\FirstCamelProject\\FirstCamelProject\\src\\log4j.properties"); 
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-configThree.xml");
		 Thread.sleep(25000);
		 ctx.close();
    }
	
}


