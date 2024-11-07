package com.xworkz.ticketServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ticketDTO.TicketDTO;
import com.xworkz.ticketImplement.TicketImplement;
import com.xworkz.ticketService.TicketService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/submit")
public class TicketServlet extends HttpServlet {
	public TicketServlet() {
		System.out.println("no-argument");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String stadiumName = arg0.getParameter("stadiumName");
		String ticket = arg0.getParameter("ticket");
		String contact = arg0.getParameter("contact");
		String email = arg0.getParameter("email");

		int ref1 = Integer.parseInt(ticket);
		long ref2 = Long.parseLong(contact);

		TicketDTO dto = new TicketDTO(stadiumName, ref1, ref2, email);
		TicketService service = new TicketImplement();
		boolean isvalid = service.validate(dto);

		if (isvalid) {
			System.out.println("details are valid");
			arg0.setAttribute("success", "booking details are valid");
			arg0.setAttribute("StadiumName", stadiumName);

		} else {
			System.out.println("details are invalid");
			arg0.setAttribute("failure", "booking details are invalid");
			arg0.setAttribute("valid", "validation error");
			arg0.setAttribute("dto", new TicketDTO(stadiumName, ref1, ref2, email));
		}

		RequestDispatcher requestDispatcher = arg0.getRequestDispatcher("/Product.jsp");
		requestDispatcher.forward(arg0, arg1);
	}

}
