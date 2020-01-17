package com.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Email email = context.getBean(Email.class);
		From from = context.getBean(From.class);
		from.setFromName("Bhawna Rajput");
		from.setFromEmail("bhawna05@gmail.com");
		To to = context.getBean(To.class);
		to.setToName("Anjali Verma");
		to.setToEmail("anjaliverma443@gmail.com");
		Subject subject = context.getBean(Subject.class);
		subject.setCaption("Just to ask");
		
		Body body = context.getBean(Body.class);
		body.setMessage("HELLO HOW ARE YOU");
		email.setTo(to);
		email.setFrom(from);
		email.setSubject(subject);
		email.setBody(body);
		System.out.println(email);
		
	}

}
