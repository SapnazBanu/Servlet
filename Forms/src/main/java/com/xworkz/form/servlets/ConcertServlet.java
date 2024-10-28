package com.xworkz.form.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.Concertdto;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Book Show")
public class ConcertServlet extends HttpServlet {

	public ConcertServlet() {
		System.out.println("Created ConcertServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in ConcertServlet...");
		String location = req.getParameter("location");
		String artistName = req.getParameter("artistName");
		String ticketType = req.getParameter("ticketType");
		String noOfTickets = req.getParameter("noOfTickets");
		String preferenceType = req.getParameter("preferenceType");
		int convertedNoOfTickets = Integer.valueOf(noOfTickets);

		System.out.println("Location:" + location);
		System.out.println("Artist Name:" + artistName);
		System.out.println("Ticket Type:" + ticketType);
		System.out.println("No Of Tickets:" + noOfTickets);
		System.out.println("Preference Type :" + preferenceType);

		PrintWriter printerWriter = resp.getWriter();
		printerWriter.println("success in sending Data");

		Concertdto concertDTO = new Concertdto(location, artistName, ticketType, convertedNoOfTickets, preferenceType);
		System.out.println("ConcertDTO :" + concertDTO);

	}
}