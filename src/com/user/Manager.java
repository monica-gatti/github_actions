/**
 * 
 */
package com.user;

import java.util.ArrayList;


/**
 * @author LENOVO
 *
 */
public class Manager extends Employe {
	/**
	 * @param firstname
	 * @param lastname
	 */
	public Manager(String firstname, String lastname, String email) {
		super(firstname, lastname, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String createUsername() {
		// TODO Auto-generated method stub
		return super.createUsername();
	}

	@Override
	public void assignPermissions(String platform) {
		super.permissions.add(platform);
	}

	@Override
	public ArrayList<String> getPermissions() {
		// TODO Auto-generated method stub		
		return super.permissions;
	}

}
