package com.xworkz.lifecycleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1, urlPatterns ="/item")
public class LifeCycleServlet extends HttpServlet {
	
	public LifeCycleServlet()
	{
		System.out.println("Running Railway in servlete");
	}
	
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		String itemName=req.getParameter("itemName");
		String quantity=req.getParameter("quantity");
		String price=req.getParameter("price");
		
		System.out.println("item name:"+itemName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		
		boolean valid=true;
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		
		if(quantity!=null) {
			int convertedQuantity=Integer.valueOf(quantity);
			if(convertedQuantity>0) {
				System.out.println("quantity is valid");
			}else {
				valid=false;
				writer.println("<span style=\"color:red\">");
				System.out.println("quantity is invalid");
				writer.println("</span>");
			}
		}
		
		if(price!=null) {
			double convertedPrice=Double.valueOf(price);
			if(convertedPrice>20) {
				System.out.println("price is valid");
			}else {
				valid=false;
				writer.println("<span style=\"color:red\">");
				System.out.println("price is invalid");
				writer.println("</span>");
			}
		}
		if(valid) {
			writer.println("<h1>Order is success:"+itemName+"</h1>");
		}
		
		writer.println("</body>");
		writer.println("</html>");
		
	}

}


