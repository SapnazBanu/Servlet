package com.xworkz.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.Interface.FormInterface;
import com.xworkz.Service.FormService;
import com.xworkz.dto.FormDTO;
import com.xworkz.implement.FormImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/SignUp")
public class SignUpForm extends HttpServlet {

	public SignUpForm() {
		System.out.println("no arg const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		String userId = arg0.getParameter("userId");
		String email = arg0.getParameter("email");
		String password = arg0.getParameter("Password");
		String confirmPassword = arg0.getParameter("confirmPassword");

		FormDTO formDTO = new FormDTO(userId, email, password, confirmPassword);

		FormImpl service = new FormImpl();
		boolean isvalid = service.printFormDetails(formDTO);

		if (isvalid) {
			System.out.println("Sign-up success");
			// arg0.setAttribute("dto", new FormDTO(userId, email));
			arg0.setAttribute("success", "signin completed");
			arg0.setAttribute("id", "id");
			arg0.setAttribute("hi", "Hi");
		} else {
			System.out.println("detail are invalid");
			arg0.setAttribute("failure", "signin incomplete");
			// arg0.setAttribute("dto", new FormDTO(userId, email));
			arg0.setAttribute("info", new FormDTO(userId, email, password, confirmPassword));
		}
		RequestDispatcher requestDispatcher = arg0.getRequestDispatcher("/SignUp.jsp");
		requestDispatcher.forward(arg0, arg1);

	}

}
