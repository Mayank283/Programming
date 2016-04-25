package com.acc.restsrv;

import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@RestController
@RequestMapping("camelapplication")
public class CamelRestWSClient {
 
//    public void onStartup(ServletContext container) throws ServletException {
// try {
//	callRestService();
//} catch (Exception e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//    }

	
	public static final void main(String[] args) throws Exception {
		Properties props = System.getProperties();
        props.setProperty("org.apache.cxf.stax.allowInsecureParser", "1");
        props.setProperty("UseSunHttpHandler", "true");
        
		PropertyConfigurator.configure("C:\\Users\\khoyendra.pande\\Development\\Workspace\\FirstCamelProject\\FirstCamelProject\\src\\log4j.properties");
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-config-rest-service.xml");
				
		Thread.sleep(5000);
		ctx.close();
    }
	
	/*@RequestMapping(value = "/callService", method = RequestMethod.GET, produces = "application/xml")
	public void callRestService() throws Exception{
		Properties props = System.getProperties();
        props.setProperty("org.apache.cxf.stax.allowInsecureParser", "1");
        props.setProperty("UseSunHttpHandler", "true");
        
		PropertyConfigurator.configure("C:\\Users\\khoyendra.pande\\Development\\Workspace\\FirstCamelProject\\FirstCamelProject\\src\\log4j.properties");
		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("WEB-INF/camel-config-rest-service.xml");
				
		Thread.sleep(5000);
		ctx.close();
	}
*/


}

