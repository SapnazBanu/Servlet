package com.xworkz.implement;

import com.xworkz.Interface.FormInterface;
import com.xworkz.dto.FormDTO;

public class FormImpl implements FormInterface {

	@Override
	public boolean printFormDetails(FormDTO form) {
		// TODO Auto-generated method stub

		boolean valid = true;

		String userId = form.getUserId();
		if (userId != null && !userId.isEmpty() && userId.length() >= 3 && userId.length() <= 100) {
			System.out.println("userId is  valid");
			valid = true;
		} else {
			System.out.println("userId is not valid");
			valid = false;
		}

		String email = form.getEmail();
		if (email != null && email.contains("@") && (email.endsWith(".com")) && email.length() >= 6
				&& email.length() <= 500) {
			System.out.println("email is valid");
			valid = true;
		} else {
			System.out.println("email is in valid");
			valid = false;

		}

		String password = form.getPassword();
		String confirmPassword = form.getConfirmPassword();
		System.out.println("password :"+password);
		if (password!= null && !password.isEmpty() && password.length() > 3 && password.length() <= 10
				&& confirmPassword.equals(password)) {
			System.out.println("password is valid");
			valid = true;
		} else {
			System.out.println("password is invalid");
			valid = false;

		}

		return valid;
	}

}
