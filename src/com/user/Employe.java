/**
 * 
 */
package com.user;

import java.util.ArrayList;

/**
 * @author LENOVO
 *
 */
public abstract class Employe extends User {
	protected String role;
	protected ArrayList<String> permissions = new ArrayList<>();
	protected abstract void assignPermissions(String platform);
	protected abstract ArrayList<String> getPermissions();
	
	/**
	 * @param firstname
	 * @param lastname
	 */
	public Employe(String firstname, String lastname, String email) {
		super(firstname, lastname, email);
	}
	@Override
	protected String createUsername() {
		return this.firstName + "." + this.lastName;
	}

}
