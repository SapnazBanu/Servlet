package com.xworkz.form.dto;

public class FeedBackdto {
	private String Name;
	private String Email;
	private String comments;

	public FeedBackdto() {
		System.out.println("created a no arg cons..............");
	}

	public FeedBackdto(String name, String email, String comments) {
		super();
		Name = name;
		Email = email;
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "FeedBackDTO [Name=" + Name + ", Email=" + Email + ", comments=" + comments + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
