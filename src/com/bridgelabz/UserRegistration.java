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
		String emailCondition = "[abc]{3}.[a-z]{3}@bl.co.[a-z]{2}";
		Pattern pattern = Pattern.compile(emailCondition);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email ID");
		String emailId = sc.nextLine();
		Matcher email = pattern.matcher(emailId);
		if(email.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

	static void checkMobileFormat() {
		String nameCondition = "[91]+\s+[0-9]{10}";
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
		sc.close();
	}

	public static void main(String[] args) {
		checkFirstAndLastName();
		checkEmail();
		checkMobileFormat();
	}
}