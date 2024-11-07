package com.xworkz.ticketImplement;


import com.xworkz.ticketDTO.TicketDTO;
import com.xworkz.ticketService.TicketService;

public class TicketImplement implements TicketService {

	@Override
	public boolean validate(TicketDTO dto) {
		// TODO Auto-generated method stub
		boolean valid= true;
		
		

	        	if (dto != null) {
	            String stadiumName = dto.getStadiumName();
	            if (stadiumName != null && !stadiumName.isEmpty() && stadiumName.length() > 5 && stadiumName.length() <= 500) {
	                System.out.println("Stadium name is valid.");
	            } else {
	                valid = false;
	                System.out.println("Invalid stadium name");
	            }

	             int ticket = dto.getTicket();
	             if ( ticket>0) { 
	                System.out.println("ticket is valid.");
	            } else {
	                valid = false;
	                System.out.println(" ticket is Invalid");
	            }
	             
	             String email = dto.getEmail();
	            if (email != null && email.contains("@") && email.endsWith(".com") && email.length() >= 6)
		                System.out.println("Stadium name is valid.");
		            } else {
		                valid = false;
		                System.out.println("Invalid stadium name");
		            }

	        return valid;
	    }

	}


