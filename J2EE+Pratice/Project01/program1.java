package com.dk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class program1 extends HttpServlet{
	private int count;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
		 * send redirect , do post, 
		 */
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text.html");
		
		HttpSession session = req.getSession();
		session.setAttribute("un",username);
		
		
		
		
		
		
		
		if(password.equals("btm@123"))
		{
			out.println("HI "+username+"Welcome to my dk connect");
		}
		else if(count >0)
		{
			out.println("Wrong password, "+count + "Attempts left");
			count--;
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
		else
		{
			resp.sendRedirect("block");
		}
	}
	
	

}
