package com.DK;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sum extends HttpServlet{

    protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
    	int num1 = Integer.parseInt(req.getParameter("num1"));
    	int num2 = Integer.parseInt(req.getParameter("num2"));
    	
    	  RequestDispatcher rd = req.getRequestDispatcher("/callproductprogram");
    	
			rd.forward(req,resp);
    	 
    }
    
}
