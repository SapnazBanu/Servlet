package com.xworkz.implement;

import com.xworkx.interfaces.FeedbackInterface;
import com.xworkz.form.dto.FeedBackdto;

public class FeedbackImpl implements FeedbackInterface {

	@Override
	public boolean validateFeedback(FeedBackdto feedbackDto) {
		boolean isValid = true;

		String name = feedbackDto.getName();
		if (name == null && name.isEmpty() && name.length() < 3 && name.length() > 100) {
			System.out.println("Name is invalid");
			isValid = false;
		} else {
			System.out.println("Name is valid");
		}

		System.out.println("================");

		String email = feedbackDto.getEmail();
		if (email == null && !email.contains("@") && !email.endsWith(".com") && email.length() < 6
				&& email.length() > 500) {
			System.out.println("Email is invalid");
			isValid = false;
		} else {
			System.out.println("Email is valid");
		}

		System.out.println("================");

		String comment = feedbackDto.getComments();
		if (comment == null && comment.isEmpty() && comment.length() < 5 && comment.length() > 500) {
			System.out.println("Comment is invalid");
			isValid = false;
		} else {
			System.out.println("Comment is valid");
		}

		return isValid;
	}

}