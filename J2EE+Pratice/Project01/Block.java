package com.dk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Block extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		/*
		 * session Management.
		 */
		HttpSession session = req.getSession();
		String name = (String)session.getAttribute("un");
		
		
		
	PrintWriter out = resp.getWriter();
	out.println("Hey "+name);
	out.println("you are blocked ,please contact the admin");
	
	
	
	}

}
