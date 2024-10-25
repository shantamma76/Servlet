package com.xworkz.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/search")
public class Search extends HttpServlet {
	
	public Search() {
		System.out.println("Running Saerch");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException
			{
		System.out.println("Running service in search");
		String email=req.getParameter("email");
		
		System.out.println("Search Email:"+email);
			
	
	PrintWriter writer=res.getWriter();
	writer.println("search successfull");
	
}

}