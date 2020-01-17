package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.SpringDemo1.ContactDetails;
import com.SpringDemo1.Customer;



@Configuration

public class AppConfig {
	
	@Bean
	public Customer getCustomer()
	{
		return new Customer();
	}
	@Bean
	public ContactDetails getContactDetails()
	{
		return new ContactDetails(); 
	}
	
}
