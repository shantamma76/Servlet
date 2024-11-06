package com.xworkz.signup.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.service.SignUpService;
import com.xworkz.signup.service.SignUpServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/sign")
public class SignUpServlet extends HttpServlet {

	public SignUpServlet() {
		System.out.println("No arg-const in SignUpServlet");
	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("Running service in SignUp Servlet");

		String userId = req.getParameter("userId");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirm");

		SignUpDTO signUpDTO = new SignUpDTO(userId, email, password, confirmPassword);

		SignUpService signUpService = new SignUpServiceImpl();
		boolean validSignUpDTO = signUpService.validateAndSave(signUpDTO);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/SignUpForm.jsp");

		if (validSignUpDTO) {
			System.out.println("Data is valid");

			req.setAttribute("userId", "signUp is success");
		} else {
			System.out.println("Data is In-valid");
			req.setAttribute("password", "signUp is Failed");
		}

		dispatcher.forward(req, res);

		System.out.println("signUpDTO:" + signUpDTO);
		System.out.println("After getting all parameter");

	}
}
