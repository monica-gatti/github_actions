/**
 * 
 */
package com.unittest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.user.Customer;
import com.user.Manager;

/**
 * @author LENOVO
 *
 */
class CustomerTest {
	
	Manager mn;
	@BeforeEach
	public void setup() {
		mn = new Manager("Mark", "Leroy", "mark.leroy@stripe.com");
		mn.assignPermissions("GMC");
	}

	@Test
	public void customerUsernameIsEmail() {
		Customer cs = new Customer("Helen", "Donald", "helene.donald@gmail.com");
		assertEquals(cs.createUsername(), "helene.donald@gmail.com");
	}
	
	@Test
	public void managerUsernameIsNameSurname() {
		//setup();
		//Manager mn = new Manager("Mark", "Leroy", "mark.leroy@stripe.com");
		assertEquals(mn.createUsername(), "Mark.Leroy");
	}
	
	@Test
	public void managerHasPermissionToAccessPlatform() {
		//setup();
		//Manager mn = new Manager("Mark", "Leroy", "mark.leroy@stripe.com");
		assertTrue(mn.getPermissions().contains("GMC"));
	}


}
