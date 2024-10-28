package com.xworkz.form.dto;

import java.time.LocalDateTime;

public class MovieTicketdto {

	private String name;
	private int totalTickets;
	private String theaterName;
	private String seatType;
	private double donation;
	private String date;

	public MovieTicketdto() {
		System.out.println("Created a no arg cons....");
	}

	public MovieTicketdto(String name, int totalTickets, String theaterName, String seatType, double donation,
			String date) {
		super();
		this.name = name;
		this.totalTickets = totalTickets;
		this.theaterName = theaterName;
		this.seatType = seatType;
		this.donation = donation;
		this.date = date;
	}

	@Override
	public String toString() {
		return "MovieTicketDTO [name=" + name + ", totalTickets=" + totalTickets + ", theaterName=" + theaterName
				+ ", seatType=" + seatType + ", donation=" + donation + ", date=" + date + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public void setTotalTickets(int totalTickets) {
		this.totalTickets = totalTickets;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public double getDonation() {
		return donation;
	}

	public void setDonation(double donation) {
		this.donation = donation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}