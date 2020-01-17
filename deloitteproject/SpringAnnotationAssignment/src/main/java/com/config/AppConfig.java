package com.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringDemo1.Body;
import com.SpringDemo1.Email;
import com.SpringDemo1.From;
import com.SpringDemo1.Subject;
import com.SpringDemo1.To;



@Configuration

public class AppConfig {
	@Bean
	public Email getEmail()
	{
		return new Email();
	}
	@Bean
	public Body getBody()
	{
		return new Body();
	}
	@Bean
	public To getTo()
	{
		return new To(); 
	}
	@Bean
	public From getFrom()
	{
		return new From();
	}
	
	@Bean
	public Subject getSubject()
	{
		return new Subject();
	}
}
