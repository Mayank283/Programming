package com.acc.wiretap.util;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.acc.beans.Student;

@Component("studentProcesor")
public class InvoiceProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Student student = exchange.getIn().getBody(Student.class);
		System.out.println("Student : "+student.getName());
		exchange.getIn().setBody(student.deepClone());
	}	
}
