package com.xworkz.ticketDTO;

public class TicketDTO {
	private  String stadiumName;
	private int Ticket;
	private  long Contact;
	private String email;
	public TicketDTO() {
		
	}
	public TicketDTO(String stadiumName, int ticket, long contact, String email) {
		super();
		this.stadiumName = stadiumName;
		Ticket = ticket;
		Contact = contact;
		this.email = email;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public int getTicket() {
		return Ticket;
	}
	public void setTicket(int ticket) {
		Ticket = ticket;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (Contact ^ (Contact >>> 32));
		result = prime * result + Ticket;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((stadiumName == null) ? 0 : stadiumName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketDTO other = (TicketDTO) obj;
		if (Contact != other.Contact)
			return false;
		if (Ticket != other.Ticket)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (stadiumName == null) {
			if (other.stadiumName != null)
				return false;
		} else if (!stadiumName.equals(other.stadiumName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TicketDTO [stadiumName=" + stadiumName + ", Ticket=" + Ticket + ", Contact=" + Contact + ", email="
				+ email + "]";
	}
	
}
