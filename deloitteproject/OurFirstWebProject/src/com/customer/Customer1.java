package com.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

/**
 * Servlet implementation class Customer1
 */
public class Customer1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerAddress= request.getParameter("customerAddress");
		int billAmount= Integer.parseInt(request.getParameter("billAmount"));
		Customer customer = new Customer(customerId,customerName,customerAddress,billAmount);
		
		CustomerDAO customerDAO = new CustomerDAOImpl();
		if(customerDAO.isCustomerExists(customerId))
		{
			System.out.println(customerId + " Already exists");
		}
		else
		{  customerDAO.addCustomer(customer);
			response.getWriter().println(customerName + " saved successfully");	
		
		
			response.getWriter().println("<h1>Customer ID : " + customerId);
			
		response.getWriter().println("<h1>Customer Name : " + customerName);
		response.getWriter().println("<h1>Customer Address : " + customerAddress);
		response.getWriter().println("<h1>bill : " + billAmount);
		}
	}

}
