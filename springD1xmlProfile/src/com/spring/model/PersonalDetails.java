package com.spring.model;

public class PersonalDetails {
	private String firstName;
	private String lastName;
	private String email;
	private long contactNo;
	private String gender;
	private String birthDate;
	private Address resAddress;
	public PersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalDetails(String firstName, String lastName, String email, long contactNo, String gender,
			String birthDate, Address resAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.gender = gender;
		this.birthDate = birthDate;
		this.resAddress = resAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public Address getResAddress() {
		return resAddress;
	}
	public void setResAddress(Address resAddress) {
		this.resAddress = resAddress;
	}
	@Override
	public String toString() {
		return "PersonalDetails [firstName=" + firstName + "\n, lastName=" + lastName + "\n, email=" + email
				+ "\n, contactNo=" + contactNo + "\n, gender=" + gender + "\n, birthDate=" + birthDate + "\n, resAddress="
				+ resAddress + "]";
	}
	
	
	
}
