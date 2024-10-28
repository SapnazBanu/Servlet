package com.xworkz.form.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.MovieTicketdto;

@WebServlet(loadOnStartup = 1, urlPatterns = "/book")

public class MovieTicketServlet extends HttpServlet {
	public MovieTicketServlet() {
		System.out.println("Created no-arg const of MovieTicketServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of MovieTicketServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in MovieTicketServlet...");
		String name = req.getParameter("name");
		String tickets = req.getParameter("tickets");
		String theater = req.getParameter("theater");
		String seattype = req.getParameter("seattype");
		String donation = req.getParameter("donation");
		String date = req.getParameter("date");

		// print it or debug mode
		System.out.println("after getting all par");
		int convertedtickets = Integer.valueOf(tickets);

		double converteddonation = Double.valueOf(donation);

		MovieTicketdto movieTicketDTO = new MovieTicketdto(name, convertedtickets, theater, seattype, converteddonation,
				date);
		System.out.println("collegeAdmissionDTO:" + movieTicketDTO);
		System.out.println("after getting all par");

	}

}