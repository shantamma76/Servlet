package com.xworkz.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/order")
public class OrderServlet extends HttpServlet {

	public OrderServlet() {
		System.out.println("Create order");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("Running Order servlet");
		String name = req.getParameter("customerName");
		String item = req.getParameter("item");
		String quantity = req.getParameter("quantity");

		System.out.println("Customer Name:" + name);
		System.out.println("Item:" + item);
		System.out.println("quantity:" + quantity);
		
		PrintWriter writer=res.getWriter();
		writer.println("oreder success for item quantity");

	}
}
