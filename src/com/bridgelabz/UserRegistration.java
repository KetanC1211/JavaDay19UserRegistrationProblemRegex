package com.bridgelabz;

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {

	public static boolean checkFirstName(String fName) {
		String nameCondition = "[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(nameCondition);
		Matcher fmatcher = pattern.matcher(fName);
		if(fmatcher.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
		return fmatcher.matches();
	}
	
	public static boolean checkLastName(String lastName) {
		String nameCondition = "[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(nameCondition);
		Matcher lName = pattern.matcher(lastName);
		if(lName.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
		return lName.matches();
	}
	
	public  boolean checkEmail(String emailId) {
		String emailCondition = "[abc]{3}([-+_])?([.][a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
		Pattern pattern = Pattern.compile(emailCondition);
			Matcher email = pattern.matcher(emailId);
			if(email.matches()) {
			System.out.println(emailId+" Valid Input");
			}
			else {
			System.out.println(emailId+" Invalid Input");
			}
		return email.matches();
	}

	public static boolean checkMobileFormat(String mobileNumber) {
		String nameCondition = "(91\s)[0-9]{10}";
		Pattern pattern = Pattern.compile(nameCondition);
		Matcher matcher = pattern.matcher(mobileNumber);
		if(matcher.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
		return matcher.matches();
	}

	public static boolean checkPassword(String password) {
		String nameCondition = "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";//atleast one uppercase
		Pattern pattern = Pattern.compile(nameCondition);
		Matcher matcher = pattern.matcher(password);
		if(matcher.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name");
		String fName = sc.nextLine();
		checkFirstName(fName);
		System.out.println("Enter the Last name");
		String lastName = sc.nextLine();
		checkLastName(lastName);		
		String validEmailId [] = {"abc@yahoo.com","abc-100@yahoo.com","abc-100@yahoo.com",
				"abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
				"abc@1.com","abc@gmail.com.com","abc+100@gmail.com",
				"abc","abc@.com.my","abc123@gmail.a","abc123@.com",
				"abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
				"abc@%*.com","abc..2002@gmail.com","abc.@gmail.com",
				"abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au",
				"abc1..@gmail.com"};
//		for (int i =0;i<validEmailId.length;i++) {
//				checkEmail(validEmailId[i]);
//		}
		System.out.println("Enter the mobile number");
		String mobileNumber = sc.nextLine();
		checkMobileFormat(mobileNumber);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		checkPassword(password);
		sc.close();
	}
}