package com.DK;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher extends HttpServlet {
	
	@Override  
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		RequestDispatcher rd = req.getRequestDispatcher("call2");
		rd.forward(req, resp);
		
		//calling one servlet to another servlet.
		
		
		
	}

}
