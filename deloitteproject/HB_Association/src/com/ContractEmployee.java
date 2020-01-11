package com;

public class ContractEmployee extends Employee {
private int contractDuration;
private int payPerDay;
	@Override
public String toString() {
	return "ContractEmployee [contractDuration=" + contractDuration + ", payPerDay=" + payPerDay + "]";
}
	public ContractEmployee(int contractDuration, int payPerDay) {
	super();
	this.contractDuration = contractDuration;
	this.payPerDay = payPerDay;
}
	public int getContractDuration() {
	return contractDuration;
}
public void setContractDuration(int contractDuration) {
	this.contractDuration = contractDuration;
}
public int getPayPerDay() {
	return payPerDay;
}
public void setPayPerDay(int payPerDay) {
	this.payPerDay = payPerDay;
}
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}
 
}
