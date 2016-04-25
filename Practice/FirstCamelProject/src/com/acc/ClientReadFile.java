package com.acc;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientReadFile {
	public static void main(String[] args) throws Exception {
		PropertyConfigurator.configure("C:\\Users\\PDC3B-Training.PDC3B\\workspace\\apache_camel_training\\FirstCamelProject\\src\\log4j.properties"); 
		//AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("resources/camel-configThree.xml");
		/*AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("resources/camel-configSeven.xml");*/
		/*AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("resources/camel-configTwelve.xml");*/
		/*AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("resources/camel-configThirteen.xml");*/
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-config-file-read.xml");
		 Thread.sleep(25000);
		 ctx.close();
	/*	CamelContext camelContext = SpringCamelContext.springCamelContext(
                ctx, false);
        try {
            camelContext.start();
            Thread.sleep(5000);
        } finally {
            camelContext.stop();
        }*/
    }
}

