package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	
public static void main(String[] args) {
	
	Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	
	EmployeeDetails emp1 = new EmployeeDetails(1019, "Radha", 20000);
	EmployeeDetails emp2 = new EmployeeDetails(1020, "Ram", 200000);
	AddressDetails addressDetails1 = new AddressDetails(111,"Pune","MH");
	AddressDetails addressDetails2 = new AddressDetails(112,"Mumbai","MH");
	AddressDetails addressDetails3 = new AddressDetails(113,"Banglore","KA");
	AddressDetails addressDetails4 = new AddressDetails(114,"Kochi","KA");
	AddressDetails addressDetails5 = new AddressDetails(115,"Bhubneshwar","OD");
	Set addressSet1 = new HashSet();
	addressSet1.add(addressDetails4);
	addressSet1.add(addressDetails3);
	addressSet1.add(addressDetails2);
	Set addressSet2 = new HashSet();
	addressSet1.add(addressDetails1);
	addressSet1.add(addressDetails4);
	addressSet1.add(addressDetails3);
	
	
	
	
	emp1.setEmployeeAddress(addressSet1);
	emp2.setEmployeeAddress(addressSet2);
	Transaction tx = session.beginTransaction();
	session.save(emp1);
	session.save(emp2);
	tx.commit();
	session.close();
	System.out.println("Saved all the data");
	factory.close();

	
	
	
	
	
	
	
	
}
}
