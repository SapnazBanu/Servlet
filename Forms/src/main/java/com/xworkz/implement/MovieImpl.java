package com.xworkz.implement;

import com.xworkx.interfaces.MovieInterface;
import com.xworkz.form.dto.MovieTicketdto;

public class MovieImpl implements MovieInterface {

	@Override
	public boolean validateMovieBooking(MovieTicketdto movieDto) {
		boolean isValid = true;

		String name = movieDto.getName();
		if (name == null && name.isEmpty() && name.length() < 2 && name.length() > 100) {
			System.out.println("Movie name is invalid");
			isValid = false;
		} else {
			System.out.println("Movie name is valid");
		}

		System.out.println("================");

		int totalTickets = movieDto.getTotalTickets();
		if (totalTickets <= 0 && totalTickets > 1000) {
			System.out.println("Total tickets is invalid");
			isValid = false;
		} else {
			System.out.println("Total tickets is valid");
		}

		System.out.println("================");

		String theaterName = movieDto.getTheaterName();
		if (theaterName == null && theaterName.isEmpty() && theaterName.length() < 2 && theaterName.length() > 100) {
			System.out.println("Theater name is invalid");
			isValid = false;
		} else {
			System.out.println("Theater name is valid");
		}

		System.out.println("================");

		double donation = movieDto.getDonation();
		if (donation < 0) {
			System.out.println("Donation is invalid");
			isValid = false;
		} else {
			System.out.println("Donation is valid");
		}

		System.out.println("================");

		String date = movieDto.getDate();
		if (date == null && date.isEmpty()) {
			System.out.println("Date is invalid");
			isValid = false;
		} else {
			System.out.println("Date is valid");
		}

		System.out.println("================");

		String time = movieDto.getName();
		if (time == null && time.isEmpty()) {
			System.out.println("Time is invalid");
			isValid = false;
		} else {
			System.out.println("Time is valid");
		}

		return isValid;
	}

}