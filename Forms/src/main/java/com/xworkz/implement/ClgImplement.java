package com.xworkz.implement;

import com.xworkx.interfaces.ClgInterface;
import com.xworkz.form.dto.Collegedto;

public class ClgImplement implements ClgInterface {

	@Override
	public boolean printAdmissionDetails(Collegedto clgDto) {

		boolean valid = true;

		String name = clgDto.getName();
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 100) {
			System.out.println("name is  valid");
			valid = false;
		} else {
			System.out.println("name is  not valid");

		}

		System.out.println("================");

		String email = clgDto.getEmail();
		if (email != null && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))
				&& email.length() >= 6 && email.length() <= 500) {
			System.out.println("email is valid");
			valid = false;
		} else {
			System.out.println("email is in valid");

		}

		System.out.println("================");

		long mobile = clgDto.getMobile();

		if (mobile >= 1000000000L && mobile <= 9999999999L) {
			System.out.println("Mobile number is valid.");
			valid = false;
		} else {
			System.out.println("Mobile number is invalid");

		}

		System.out.println("================");

		String address = clgDto.getAddress();
		if (address != null && !address.isEmpty() && address.length() >= 10 && address.length() <= 500) {
			System.out.println("Address is valid.");
			valid = false;
		} else {
			System.out.println("Address is invalid");

		}

		System.out.println("================");
		String fatherName = clgDto.getFathername();
		if (fatherName != null && !fatherName.isEmpty() && fatherName.length() >= 3 && fatherName.length() <= 100) {
			System.out.println("Father's name is valid.");
		} else {
			System.out.println("Fathername is invalid");
			valid = false;
		}

		System.out.println("================");

		String motherName = clgDto.getMothername();
		if (motherName != null && !motherName.isEmpty() && motherName.length() >= 3 && motherName.length() <= 500) {
			System.out.println("Mother's name is valid");
			valid = false;
		} else {
			System.out.println("Mothername is in valid");

		}

		System.out.println("================");

		float percentage = clgDto.getPercentage();
		if (percentage >= 0 && percentage <= 100) {
			System.out.println("Percentage is valid");
			valid = false;
		} else {
			System.out.println("Percentage is invalid");

		}

		System.out.println("================");

		int age = clgDto.getAge();
		if (age >= 18 && age <= 60) {
			System.out.println("Age is valid.");
			valid = false;
		} else {
			System.out.println(" Age is in valid");

		}

		return valid;

	}

}
