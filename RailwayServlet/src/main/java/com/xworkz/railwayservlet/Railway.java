package com.xworkz.railwayservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/railway")
public class Railway extends HttpServlet {

	public Railway() {
		System.out.println("Running Railway in servlete");
	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("Running service in Railway Servlet");

		String name = req.getParameter("name");
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");
		String startDate = req.getParameter("startDate");
		String returnDate = req.getParameter("returnDate");
		String seatType = req.getParameter("seatType");
		String ticket = req.getParameter("totalTicket");
		String male = req.getParameter("male");
		String female = req.getParameter("female");

		System.out.println("Name:" + name);
		System.out.println("Source:" + source);
		System.out.println("Destination:" + destination);
		System.out.println("Start Date:" + startDate);
		System.out.println("Source:" + source);
		System.out.println("Return Date:" + returnDate);
		System.out.println("Seat Type:" + seatType);
		System.out.println("Total Ticket:" + ticket);
		System.out.println("No of Male:" + male);
		System.out.println("No of FeMale:" + female);

		PrintWriter writer = res.getWriter();
		writer.println("Displaying All Information");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>" + "Train ticket booking" + "</title>");
		writer.println("</head>");
		writer.println("<body>");

		writer.println("<h4>Name:" + req.getParameter("name"));
		writer.println("</h4>");
		writer.println("<h4>Source:" + req.getParameter("source"));
		writer.println("</h4>");
		writer.println("<h4>Destination:" + req.getParameter("destination"));
		writer.println("</h4>");
		writer.println("<h4>StartDate:" + req.getParameter("startDate"));
		writer.println("</h4>");
		writer.println("<h4>ReturnDate:" + req.getParameter("returnDate"));
		writer.println("</h4>");
		writer.println("<h4>SeatType:" + req.getParameter("seatType"));
		writer.println("</h4>");
		writer.println("<h4>TotalTicket:" + req.getParameter("totalTicket"));
		writer.println("</h4>");
		writer.println("<h4>No of Male:" + req.getParameter("male"));
		writer.println("</h4>");
		writer.println("<h4>No of Female:" + req.getParameter("female"));
		writer.println("</h4>");
		writer.println("</html>");
		writer.println("Railway ticket is succussfully done");

	}
}
