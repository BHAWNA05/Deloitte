package com.SpringDemo1;

public class ContactDetails {
	
	@Override
	public String toString() {
		return "ContactDetails [mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
	}
	private String mobileNumber;
	private String emailId;
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
