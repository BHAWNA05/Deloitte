package com.SpringDemo1;

public class From {
	private String fromName;
	private String fromEmail;
	public From(String fromName, String fromEmail) {
		super();
		this.fromName = fromName;
		this.fromEmail = fromEmail;
	}
	@Override
	public String toString() {
		return "From [fromName=" + fromName + ", fromEmail=" + fromEmail + "]";
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
public From() {
	// TODO Auto-generated constructor stub
}
}
