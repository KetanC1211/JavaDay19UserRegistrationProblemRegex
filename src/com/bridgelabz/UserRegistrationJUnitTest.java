package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationJUnitTest {

	@Test
	public void firtsNameTest_ShouldReturnTrue() {
		UserRegistration obj1 = new UserRegistration();
		boolean value = obj1.checkFirstName("Ketan");
		//test output
		assertEquals(true,value);
	}
	
	@Test
	public void lastNameTest2_ShouldReturnTrue() {
		UserRegistration obj2 = new UserRegistration();
		boolean value = obj2.checkLastName("Chindarkar");
		//test output
		assertEquals(true,value);
	}
	
	@Test
	public void checkEmailTest3_ShouldReturnTrue() {
		UserRegistration obj2 = new UserRegistration();
		boolean value = obj2.checkEmail("abc.xyz@gmail.com");
		//test output
		assertEquals(true,value);
	}
	@Test
	public void checkMobileNumberTest4_ShouldReturnTrue() {
		UserRegistration obj2 = new UserRegistration();
		boolean value = obj2.checkMobileFormat("91 9967945885");
		//test output
		assertEquals(true,value);
	}
	@Test
	public void checkPasswordTest5_ShouldReturnTrue() {
		UserRegistration obj2 = new UserRegistration();
		boolean value = obj2.checkPassword("Abcd@1234A");
		//test output
		assertEquals(true,value);
	}
}
