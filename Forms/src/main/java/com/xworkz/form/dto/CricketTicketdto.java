package com.xworkz.form.dto;

public class CricketTicketdto {
	private String groundName;
	private String customerNAME;
	private String customerEmail;
	private String seatType;
	private int noOfTickets;

	public CricketTicketdto() {

	}

	@Override
	public String toString() {
		return "CricketTicketDTO [groundName=" + groundName + ", customerNAME=" + customerNAME + ", customerEmail="
				+ customerEmail + ", seatType=" + seatType + ", noOfTickets=" + noOfTickets + "]";
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public String getCustomerNAME() {
		return customerNAME;
	}

	public void setCustomerNAME(String customerNAME) {
		this.customerNAME = customerNAME;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public CricketTicketdto(String groundName, String customerNAME, String customerEmail, String seatType,
			int noOfTickets) {
		super();
		this.groundName = groundName;
		this.customerNAME = customerNAME;
		this.customerEmail = customerEmail;
		this.seatType = seatType;
		this.noOfTickets = noOfTickets;
	}
}
