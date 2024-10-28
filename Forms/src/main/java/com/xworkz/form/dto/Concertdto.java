package com.xworkz.form.dto;

public class Concertdto {
	private String location;
	private String artistName;
	private String ticketType;
	private int noOfTickets;
	private String preferenceType;

	public Concertdto() {

	}

	public Concertdto(String location, String artistName, String ticketType, int noOfTickets, String preferenceType) {
		super();
		this.location = location;
		this.artistName = artistName;
		this.ticketType = ticketType;
		this.noOfTickets = noOfTickets;
		this.preferenceType = preferenceType;
	}

	@Override
	public String toString() {
		return "ConcertDTO [location=" + location + ", artistName=" + artistName + ", ticketType=" + ticketType
				+ ", noOfTickets=" + noOfTickets + ", preferenceType=" + preferenceType + "]";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getPreferenceType() {
		return preferenceType;
	}

	public void setPreferenceType(String preferenceType) {
		this.preferenceType = preferenceType;
	}
}