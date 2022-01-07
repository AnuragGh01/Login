package com.sign_up;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class display
 */
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pwl=res.getWriter();
		String email=req.getParameter("email");
		String name=req.getParameter("name");
		String pass=req.getParameter("pwd");
		
		pwl.println("<html><head><title>Display</title><body bgcolor=green>welcome<br> "+email+"<br>"+name+"</body></head></html>");
		
	}

}
