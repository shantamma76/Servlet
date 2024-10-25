package com.xworkz.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class Register extends HttpServlet {

	public Register() {
		System.out.println("");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("Running service in Register");
		String firstName = req.getParameter("firstName");
		String lName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		String state = req.getParameter("state");
		String city = req.getParameter("city");

		System.out.println("FirstName:" + firstName);
		System.out.println("LastName:" + lName);
		System.out.println("email:" + email);
		System.out.println("Password:" + password);
		System.out.println("gender:" + gender);
		System.out.println("country:" + country);
		System.out.println("state:" + state);
		System.out.println("city:" + city);

		PrintWriter writer = res.getWriter();
		writer.println("Drop Dwon");

	}

}
