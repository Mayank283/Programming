package com.acc.marshaller;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.beans.StudentXml;

public class CamelMashallerClient {
	
	@Produce(uri="direct:invoice")
	ProducerTemplate template;
	
	public static final void main(String[] args) throws Exception {
              
		PropertyConfigurator.configure("C:\\Users\\khoyendra.pande\\Development\\Workspace\\FirstCamelProject\\FirstCamelProject\\src\\log4j.properties");
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-configMarshaller.xml");
		StudentXml student = new StudentXml(1, "KKP");
		
		CamelMashallerClient client = (CamelMashallerClient) ctx.getBean("client");
		
		Object xml = client.template.requestBody(student);
		
		System.out.println("Object Value : "+xml);
		System.out.println("Object Class : "+xml.getClass());
		Thread.sleep(5000);
		ctx.close();
    }
}
