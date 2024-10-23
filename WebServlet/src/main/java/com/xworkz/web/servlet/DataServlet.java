package com.xworkz.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (loadOnStartup =1, urlPatterns="/send")
public class DataServlet extends HttpServlet {
	
	public DataServlet() {
		System.out.println("Created data servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws 
	ServletException,IOException {
	System.out.println("Running service in DataServlet");
	String name=req.getParameter("customer");
	String email=req.getParameter("email");
	System.out.println("Name:" +name);
	System.out.println("email:" +email);
	}
}
