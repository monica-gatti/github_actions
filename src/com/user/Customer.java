package com.user;

public class Customer extends User {
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Customer(String firstName, String lastName, String email) {
		super(firstName, lastName, email);
	}
	public String createUsername() {
		return super.email;
	}

}
