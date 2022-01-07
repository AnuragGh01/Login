package com.sign_up;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class setpass
 */
public class setpass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		res.setContentType("text/html");
		PrintWriter pl=res.getWriter();
		String sq=req.getParameter("sq");
		String ans=req.getParameter("ans");
		
		pl.println("<html><head><title>Set password</title><body bgcolor=green>hello<br> "+sq+"<br>"+ans+"</body></head></html>");
		
		pl.println("<html><body><br>Enter new password: <input type=password><br></body></html>");
		pl.println("<html><body><br>Confirm password: <input type=password><br></body></html>");
		pl.println("<html><body><form method=post action=tempo><br> <input type=submit></form></body></html>");

	}

}
