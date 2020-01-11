package com;

import java.nio.channels.SeekableByteChannel;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String args[]) {

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		
		
		
		Transaction tx = session.beginTransaction();
		
		Employee employee = new Employee(1222,"Kalpana");
		session.save(employee);
		RegularEmployee employee2 = new RegularEmployee(41000,9000);
		employee2.setEmployeeId(111);
		employee2.setEmployeeName("Arjun");
		session.save(employee2);
		ContractEmployee employee3 = new ContractEmployee(90, 1000);
		employee3.setEmployeeId(112);
		employee3.setEmployeeName("Karan");
		session.save(employee3);
		
		
		
		tx.commit();
		session.close();
		System.out.println("Done");
		factory.close();
		


	}
}
