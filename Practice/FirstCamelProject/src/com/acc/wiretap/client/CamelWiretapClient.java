package com.acc.wiretap.client;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.beans.Student;
 
public class CamelWiretapClient {
 
	@Produce(uri="direct:invoice")
	ProducerTemplate template;
	
	public static final void main(String[] args) throws Exception {
              
		PropertyConfigurator.configure("C:\\Users\\khoyendra.pande\\Development\\Workspace\\FirstCamelProject\\FirstCamelProject\\src\\log4j.properties"); 
//		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-configFour.xml");
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-configSix.xml");
		Student student = new Student(1, "KKP");
		
		CamelWiretapClient client = (CamelWiretapClient) ctx.getBean("client");
		
		Object xml = client.template.requestBody(student);
		
		System.out.println("Object Value : "+xml);
		System.out.println("Object Class : "+xml.getClass());
		Thread.sleep(5000);
		ctx.close();
    }
}
