package com.SpringDemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.config.AppConfig;

/**
 * Hello world!
 *
 */
public class AppSpring {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		

		Customer customer = context.getBean(Customer.class);
		customer.setCustomerId(101);
		customer.setCustomerName("Bhawna");
		customer.setCustomerAddress("Pune");
		customer.setBillAmount(25000);
		ContactDetails contactDetails = context.getBean(ContactDetails.class);
		contactDetails.setMobileNumber("897067564");
		contactDetails.setEmailId("bhawna@gmail.com");
        
		System.out.println(customer);
		context.registerShutdownHook();
	

	}
}
