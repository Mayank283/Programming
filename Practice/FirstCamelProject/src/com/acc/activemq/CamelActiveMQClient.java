package com.acc.activemq;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelActiveMQClient {
	
	public static final void main(String[] args) throws Exception {
              
        PropertyConfigurator.configure("C:\\Users\\PDC3B-Training.PDC3B\\workspace\\apache_camel_training\\FirstCamelProject\\src\\log4j.properties");
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-config-activemq.xml");
		
		Thread.sleep(5000);
		ctx.close();
		System.exit(0);
    }
}
