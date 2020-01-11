package com.cms.deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dbcon.DBConnection;
import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	AnnotationConfiguration configuration =null;
	SessionFactory factory=null;
	
	public CustomerDAOImpl() {
		AnnotationConfiguration configuration = new AnnotationConfiguration().configure();
		factory = configuration.buildSessionFactory();
	}
	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction transaction =session.beginTransaction();
		
		session.update(customer);
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public List<Customer> listCustomers() {
		Session session = factory.openSession();
		Query query =session.createQuery("from Customer");
		return query.list();
		
	}

	@Override
	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		 Session session = factory.openSession();
	        Customer customer =(Customer)session.get(Customer.class, customerId);
	        session.close();
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
        Session session = factory.openSession();
        Customer customer =(Customer)session.get(Customer.class, customerId);
        session.close();
        if( customer==null)
		return false;
        else
        	return true;
	}
	@Override
	public List<String> filterCustomer(int billAmount) {
	     Session session = factory.openSession();
	     Query query = session.createQuery("select c.customerName from Customer c where c.billAmount >" + billAmount);
	     return query.list();
	
	}
	@Override
	public List<Customer> filterCustomer(String customerAddress, int billAmount) {
		// TODO Auto-generated method stub
		 Session session = factory.openSession();
		 Criteria criteria = session.createCriteria(Customer.class);
		 criteria.add(Restrictions.like("customerAddress",customerAddress));
		 criteria.add(Restrictions.like("billAmount",billAmount));
		return criteria.list();
	}
	
	}

	
	



