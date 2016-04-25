package com.acc.database;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelDataBaseClient {
	
	public static final void main(String[] args) throws Exception {
              
		PropertyConfigurator.configure("C:\\Users\\khoyendra.pande\\Development\\Workspace\\FirstCamelProject\\FirstCamelProject\\src\\log4j.properties");
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-config-database.xml");
		
		Thread.sleep(5000);
		ctx.close();
    }
}
