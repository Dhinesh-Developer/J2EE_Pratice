package com.DK;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class program3 {
	
	 protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String un =  req.getParameter("username");
		String ps = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		writer.println("Hai "+un+",Welcome To Dk HomePage");
		
		
		
		
		
		
	
	// System.out.println("Welcome" + un);
	}

}
