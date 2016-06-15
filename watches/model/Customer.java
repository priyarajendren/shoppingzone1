package com.watches.model;

public class Customer {
	private String firstName;
	private String lastName;
	private int userId;
	private String password;
	public Customer(String firstName, String lastName, int userId, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.password = password;
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
	public  int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
	
}
		
		
	

