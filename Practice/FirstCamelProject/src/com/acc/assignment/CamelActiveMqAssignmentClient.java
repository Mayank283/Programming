package com.acc.assignment;

import java.util.List;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.beans.Bill;

public class CamelActiveMqAssignmentClient {
	
	@Produce(uri="direct:invoice")
	ProducerTemplate template;
	
	public static final void main(String[] args) throws Exception {
              
		PropertyConfigurator.configure("C:\\Users\\khoyendra.pande\\Development\\Workspace\\FirstCamelProject\\FirstCamelProject\\src\\log4j.properties");
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-config-activemq-assignment.xml");
		
		List<Bill> bills = Bill.getBillList();
		
		CamelActiveMqAssignmentClient client = (CamelActiveMqAssignmentClient) ctx.getBean("client");
		
		Object xml = client.template.requestBody(bills);
		
		System.out.println("Object Value : "+xml);
		System.out.println("Object Class : "+xml.getClass());
		Thread.sleep(5000);
		ctx.close();
		System.exit(0);
    }
}
