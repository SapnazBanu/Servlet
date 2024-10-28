package com.xworkz.implement;

import com.xworkx.interfaces.ConcertInterface;
import com.xworkz.form.dto.Concertdto;

public class ConcertImplement implements ConcertInterface {

	@Override
	public boolean validateConcertDetails(Concertdto concertDto) {

		boolean isValid = true;

		String location = concertDto.getLocation();
		if (location == null || location.isEmpty() || location.length() < 3 || location.length() > 100) {
			System.out.println("Location is invalid");
			isValid = false;
		} else {
			System.out.println("Location is valid");

		}

		System.out.println("================");

		String artistName = concertDto.getArtistName();
		if (artistName == null || artistName.isEmpty() || artistName.length() < 3 || artistName.length() > 100) {
			System.out.println("Artist Name is invalid");
			isValid = false;
		} else {
			System.out.println("Artist Name is valid");

		}

		System.out.println("================");

		int noOfTickets = concertDto.getNoOfTickets();
		if (noOfTickets <= 0) {
			System.out.println("Number of Tickets is invalid");
			isValid = false;
		} else {
			System.out.println("Number of Tickets is valid");
		}

		System.out.println("================");

		return isValid;
	}

}