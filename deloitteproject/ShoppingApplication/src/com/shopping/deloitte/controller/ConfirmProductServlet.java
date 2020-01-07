package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConfirmProductServlet
 */
public class ConfirmProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String selectedItems[] =request.getParameterValues("item");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String username=(String) session.getAttribute("currentBuyer");
		if(selectedItems == null)
		{
			out.println("Dont be smart " + " " +username+ "Select at least one product");
			out.println("<a href=item.html>Go Back </a>");
		}
		else
		{
			out.println(username+" " + "have selected the following items:");
			for(String product:selectedItems)
			{
				out.println("<h1>" + product);
				
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
