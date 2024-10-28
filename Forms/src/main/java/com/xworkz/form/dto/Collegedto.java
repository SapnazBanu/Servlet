package com.xworkz.form.dto;

import java.io.Serializable;

public class Collegedto implements Serializable {

	private String name;
	private String email;
	private long mobile;
	private String address;
	private String fathername;
	private String mothername;
	private float percentage;
	private String Course;
	private int Age;

	public Collegedto() {

	}

	public Collegedto(String name, String email, long mobile, String address, String fathername, String mothername,
			float percentage, String course, int age) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.fathername = fathername;
		this.mothername = mothername;
		this.percentage = percentage;
		Course = course;
		Age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Collegedto [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address
				+ ", fathername=" + fathername + ", mothername=" + mothername + ", percentage=" + percentage
				+ ", Course=" + Course + ", Age=" + Age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + ((Course == null) ? 0 : Course.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fathername == null) ? 0 : fathername.hashCode());
		result = prime * result + (int) (mobile ^ (mobile >>> 32));
		result = prime * result + ((mothername == null) ? 0 : mothername.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(percentage);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Collegedto))
			return false;
		Collegedto other = (Collegedto) obj;
		if (Age != other.Age)
			return false;
		if (Course == null) {
			if (other.Course != null)
				return false;
		} else if (!Course.equals(other.Course))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fathername == null) {
			if (other.fathername != null)
				return false;
		} else if (!fathername.equals(other.fathername))
			return false;
		if (mobile != other.mobile)
			return false;
		if (mothername == null) {
			if (other.mothername != null)
				return false;
		} else if (!mothername.equals(other.mothername))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(percentage) != Float.floatToIntBits(other.percentage))
			return false;
		return true;
	}

}