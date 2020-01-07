package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("username");
	String wifeName = request.getParameter("wifeName");
	
	PrintWriter out = response.getWriter();
	HttpSession session = request.getSession();
	session.setAttribute("currentBuyer", username);
	Cookie allCookies[] = request.getCookies();
	boolean alreadyVisited = false;
	int count=0;
	for(Cookie c:allCookies)
	{
		if(c.getName().equals(username))
		{
			alreadyVisited=true;
			count++;
			break;
		}
	}
	out.println("<h1> Successfully authenticated");
	
	out.println("<h1>"  + username + "buys gifts for" + "" +wifeName);
	if(!alreadyVisited)
	{
	out.println("<h1> Welcome ,you are the first visitor" + username);
	Cookie cookie = new Cookie(username,username);
	response.addCookie(cookie);
	
	}
	
	else if(count>0)
	{
		out.println("<h1> You Are already visited");
	}
	
	else
	{
		out.println("<h1><a href='item.html'>Select Products</a>");
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
