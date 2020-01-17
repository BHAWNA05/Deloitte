package com.SpringDemo1;

public class Body {
	
	
	private String message;

	@Override
	public String toString() {
		return "Body [message=" + message + "]";
	}

	public Body(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public Body() {
		// TODO Auto-generated constructor stub
	}

}
