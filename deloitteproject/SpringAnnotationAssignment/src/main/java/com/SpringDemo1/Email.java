package com.SpringDemo1;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Email implements Serializable{
	@Autowired
	private To to;
	@Autowired
	private From from;
	@Autowired(required = false)
	private Body body;
	@Autowired(required = false)
	private Subject subject;
	public Email(To to, From from) {
		super();
		this.to = to;
		this.from = from;
	}
	public Email(To to, From from, Body body, Subject subject) {
		super();
		this.to = to;
		this.from = from;
		this.body = body;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "\nEmail [to=" + to + ", from=" + from + ", body=" + body + ", subject=" + subject + "]";
	}
	public To getTo() {
		return to;
	}
	public void setTo(To to) {
		this.to = to;
	}
	public From getFrom() {
		return from;
	}
	public void setFrom(From from) {
		this.from = from;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public Email() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
