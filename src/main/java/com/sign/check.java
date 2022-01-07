package com.sign;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class check
 */
public class check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pwl=res.getWriter();
		int num=Integer.parseInt(req.getParameter("n"));
		if(num%2==0)
			pwl.println("<html><title>check</title>The number is:Even<br>");
		else
			pwl.println("<html><title>check</title>The number is:Odd<br>");


	}

}
