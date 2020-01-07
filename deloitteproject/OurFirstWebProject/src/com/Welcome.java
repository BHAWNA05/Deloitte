package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.security.Init;


public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public Welcome() {
      System.out.println("Welcome cons called");
        // TODO Auto-generated constructor stub
    }
    public void init() {
    	System.out.println("Init called");
    }
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    System.out.println("Destory called");
    }
int counter=0;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter++;
		String usern = request.getParameter("username"); 
		String password =request.getParameter("password");
		response.getWriter().println("<h1> Welcome to my website </h1>");
		response.getWriter().println("<h1> you are visitor number:" + counter);
		response.getWriter().println("<a href='Shop.html'>SHOP</a>");
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		counter++;
		String usern = request.getParameter("username"); 
		String password =request.getParameter("password");
		response.getWriter().println("<h1> Welcome to my website </h1>");
		response.getWriter().println("<h1> you are visitor number:" + counter);
		response.getWriter().println("<a href='Shop.html'>SHOP</a>");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		counter++;
		String usern = request.getParameter("username"); 
		String password =request.getParameter("password");
		response.getWriter().println("<h1> Welcome to my website </h1>");
		response.getWriter().println("<h1> you are visitor number:" + counter);
		response.getWriter().println("<a href='Shop.html'>SHOP</a>");
		
	}
	
	
		
	}
		