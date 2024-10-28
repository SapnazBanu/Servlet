package com.xworkz.implement;

import com.xworkx.interfaces.CricketInterface;
import com.xworkz.form.dto.CricketTicketdto;

public class CricketImpl implements CricketInterface {

	@Override
	public boolean validateCricketBooking(CricketTicketdto cricketDto) {

		boolean isValid = true;

		String groundName = cricketDto.getGroundName();
		if (groundName == null && groundName.isEmpty() && groundName.length() < 3 && groundName.length() > 100) {
			System.out.println("Ground Name is invalid");
			isValid = false;
		} else {
			System.out.println("Ground Name is valid");
		}

		System.out.println("================");

		String customerName = cricketDto.getCustomerNAME();
		if (customerName == null && customerName.isEmpty() && customerName.length() < 3
				&& customerName.length() > 100) {
			System.out.println("Customer Name is invalid");
			isValid = false;
		} else {
			System.out.println("Customer Name is valid");
		}

		System.out.println("================");

		String customEmail = cricketDto.getCustomerEmail();
		if (customEmail == null && !customEmail.contains("@") && !customEmail.endsWith(".com")
				&& customEmail.length() < 6 || customEmail.length() > 500) {
			System.out.println("Customer Email is invalid");
			isValid = false;
		} else {
			System.out.println("Customer Email is valid");
		}

		System.out.println("================");

		int noOfTickets = cricketDto.getNoOfTickets();
		if (noOfTickets <= 0) {
			System.out.println("Number of Tickets is invalid");
			isValid = false;
		} else {
			System.out.println("Number of Tickets is valid");
		}
		return isValid;
	}

}