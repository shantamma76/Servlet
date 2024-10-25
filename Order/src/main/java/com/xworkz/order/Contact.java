package com.xworkz.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/contact")
public class Contact extends HttpServlet {

	public Contact() {
		System.out.println("running Contact");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("Running service in contact ");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String age = req.getParameter("age");
		String address = req.getParameter("address");

		System.out.println("Name:" + name);
		System.out.println("Email:" + email);
		System.out.println("Mobile:" + mobile);
		System.out.println("Age:" + age);
		System.out.println("Address:" + address);
		
		PrintWriter writer=res.getWriter();
		writer.println("Contact successfull");

	}
}


