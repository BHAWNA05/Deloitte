package com.SpringDemo1;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class AppSpring 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
        Customer customer = (Customer) context.getBean("cust");
        
        
        
        
        
      
        System.out.println(customer);
        context.registerShutdownHook();
        
        
        
     
    }
}
