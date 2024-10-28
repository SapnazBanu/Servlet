package com.xworkz.form.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.CricketTicketdto;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Book Tickets")
public class CricketTicketServlet extends HttpServlet {

	public CricketTicketServlet() {
		System.out.println("Created CricketTicketServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in CricketTicketServlet...");
		String groundName = req.getParameter("groundName");
		String customerNAME = req.getParameter("customerNAME");
		String customerEmail = req.getParameter("customerEmail");
		String seatType = req.getParameter("seatType");
		String noOfTickets = req.getParameter("noOfTickets");
		int convertedNoOfTickets = Integer.valueOf(noOfTickets);

		System.out.println("Ground Name:" + groundName);
		System.out.println("Customer NAME:" + customerNAME);
		System.out.println("Customer Email:" + customerEmail);
		System.out.println("Seat Type:" + seatType);
		System.out.println("No Of Tickets :" + noOfTickets);

		PrintWriter printerWriter = resp.getWriter();
		printerWriter.println("success in sending Data");

		CricketTicketdto cricketTicketDTO = new CricketTicketdto(groundName, customerNAME, customerEmail, seatType,
				convertedNoOfTickets);

		System.out.println("CricketTicketDTO :" + cricketTicketDTO);
	}
}
