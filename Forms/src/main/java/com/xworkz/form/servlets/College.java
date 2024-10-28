package com.xworkz.form.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkx.interfaces.ClgInterface;
import com.xworkz.form.dto.Collegedto;
import com.xworkz.implement.ClgImplement;

@WebServlet(loadOnStartup = 1, urlPatterns = "/addmit")
public class College extends HttpServlet {

	public College() {
		System.out.println("no arg const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		String name = arg0.getParameter("name");
		String email = arg0.getParameter("email");
		String mobile = arg0.getParameter("number");
		String address = arg0.getParameter("address");
		String fatherName = arg0.getParameter("fatherName");
		String motherName = arg0.getParameter("motherName");
		String percentage = arg0.getParameter("percentage");
		String course = arg0.getParameter("course");
		String age = arg0.getParameter("age");

		long ref1 = Long.valueOf(mobile);
		float ref2 = Float.valueOf(percentage);
		int ref3 = Integer.valueOf(age);

		Collegedto dto1 = new Collegedto(name, email, ref1, address, fatherName, motherName, ref2, course, ref3);
		System.out.println("" + name + "" + email + "" + ref1 + "" + address + "" + fatherName + "" + motherName + ""
				+ ref2 + "" + course + "" + ref3 + "");

		ClgInterface value = new ClgImplement();
		boolean isvalid = value.printAdmissionDetails(dto1);
		if (isvalid) {

			System.out.println("details are valid");

		} else {

			System.out.println("details are invalid");

		}

		arg0.setAttribute("studentName", name);
		RequestDispatcher dispatcher = arg0.getRequestDispatcher("/College.jsp");
		dispatcher.forward(arg0, arg1);

	}

}