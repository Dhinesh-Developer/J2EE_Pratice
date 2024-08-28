package com.DK;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	


	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("username");
		String name1 = request.getParameter("password");
		System.out.println("Welcome "+name + "succesfuul verified");
 	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("username");
		String name1 = request.getParameter("password");
		System.out.println("Welcome "+name + "succesfuul verified");
 	}

}
