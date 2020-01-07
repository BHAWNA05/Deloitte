package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticateServlet
 */
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
			//out.println("<h2> <a href =index.html>item</a>" );  //normal way*/
			RequestDispatcher dispatcher = request.getRequestDispatcher("WelcomeServlet"); //directly redirect to pages number by number
			dispatcher.forward(request, response);
			out.println("<h1> <form action='WelcomeServlet'>");
			out.println("<h1> Wife name: <input type='text' name='wifeName'>");
			out.println("<h1> <input type='hidden' name='username' value=" + username+ "</input>");
			out.println("<h1><input type='submit' value='Enter'>");
			out.println("<h1></form>");
		}
		
	}


	

