package com.bridgelabz;

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
	
	static void checkStringFormat() {
		System.out.println("Enter the first Name");
		Scanner sc = new Scanner(System.in);
		String fName = sc.nextLine();
		String fNameCheck = "[A-Z]{1}[a-z]{2,}";
		 
		Pattern pattern = Pattern.compile(fNameCheck);
		Matcher matcher = pattern.matcher(fName);
		System.out.println(matcher.matches());
		sc.close();
	}
	
	public static void main(String[] args) {
		checkStringFormat();
	}
}