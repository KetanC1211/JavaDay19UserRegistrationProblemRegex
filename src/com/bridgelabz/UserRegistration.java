package com.bridgelabz;

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {


	static void checkFirstAndLastName() {
		String nameCondition = "[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(nameCondition);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		String fName = sc.nextLine();//Scanning first name
		Matcher fmatcher = pattern.matcher(fName);
		if(fmatcher.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		System.out.println("Enter the Last name");
		String LName = sc.nextLine();//Scanning Last name 
		Matcher lastName = pattern.matcher(LName);
		if(lastName.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	
	static void checkEmail() {
		String emailCondition = "[abc]{3}([-+_])?([.a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
		Pattern pattern = Pattern.compile(emailCondition);
		
		String validemailId [] = {"abc@yahoo.com","abc-100@yahoo.com","abc-100@yahoo.com",
				"abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
				"abc@1.com","abc@gmail.com.com","abc+100@gmail.com",
				"abc","abc@.com.my","abc123@gmail.a","abc123@.com",
				"abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
				"abc@%*.com","abc..2002@gmail.com","abc.@gmail.com",
				"abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au",
				"abc1..@gmail.com"};

		for(int i=0;i<validemailId.length;i++) {
			Matcher email = pattern.matcher(validemailId[i]);
			if(email.matches()) {
			
			System.out.println(validemailId[i]+" Valid Input");
			}
			else {
			System.out.println(validemailId[i]+" Invalid Input");
			}
		}
	}

	static void checkMobileFormat() {
		String nameCondition = "(91\s)[0-9]{10}";
		Pattern pattern = Pattern.compile(nameCondition);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile number");
		String emailId = sc.nextLine();//Scanning first name
		Matcher fmatcher = pattern.matcher(emailId);
		if(fmatcher.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

	static void checkPassword() {
		String nameCondition = "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";//atleast one [uppercase/numer/special char]
		Pattern pattern = Pattern.compile(nameCondition);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String checkPassword = sc.nextLine();//Scanning first name
		Matcher fmatcher = pattern.matcher(checkPassword);
		if(fmatcher.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

	
	public static void main(String[] args) {
		checkFirstAndLastName();
		checkEmail();
		checkMobileFormat();
		checkPassword();
	}
}