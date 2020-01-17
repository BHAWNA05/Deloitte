package com.SpringDemo1;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Set;

public class Customer implements Serializable {
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	private ContactDetails contactdetails;
	private Set cards;
	
	
	
	
	public void displayInit() {
		System.out.println("Display");
	}
	public void cleanUp() {
		System.out.println("CLeaning up");
	}
	
	public Customer(Set cards) {
		super();
		this.cards = cards;
	}
	public Customer(int customerId, String customerName, String customerAddress, int billAmount,
			ContactDetails contactdetails, Set cards) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
		this.contactdetails = contactdetails;
		this.cards = cards;
	}
	public Set getCards() {
		return cards;
	}
	public void setCards(Set cards) {
		this.cards = cards;
	}
	public ContactDetails getContactdetails() {
		return contactdetails;
	}
	public void setContactdetails(ContactDetails contactdetails) {
		this.contactdetails = contactdetails;
	}
	public void acceptCustomerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer id : "); customerId = scanner.nextInt();
        System.out.println("Enter customer name : "); customerName = scanner.next();
        System.out.println("Enter customer address : "); customerAddress = scanner.next();
        System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
    }
	 public Customer()
	 {
		 
	 }
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + ", contactdetails=" + contactdetails + ", cards="
				+ cards + "]";
	}
	/*public Customer(ContactDetails contactdetails) {
		super();
		this.contactdetails = contactdetails;
	}*/
	public Customer(int customerId, ContactDetails contactdetails) {
		super();
		this.customerId = customerId;
		this.contactdetails = contactdetails;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	 

}
