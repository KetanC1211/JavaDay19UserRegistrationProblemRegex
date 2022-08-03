package com.bridgelabz;

import java.util.regex.*;


interface check{  
    public String format(String name);   
}  

public class UserRegistration {

	public static void main(String[] args) {
		//Lambda expression for Chceking first Name
		check obj = (name)->{ 
			String nameCondition = "[A-Z]{1}[a-z]{2,}";
			Pattern pattern = Pattern.compile(nameCondition);
			Matcher fmatcher = pattern.matcher(name);
			if(fmatcher.matches()) {
				return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
        };
        System.out.println(obj.format("Ketan"));
        
      //Lambda expression for Chceking last Name
        check lastName = (name)->{ 
			String nameCondition = "[A-Z]{1}[a-z]{2,}";
			Pattern pattern = Pattern.compile(nameCondition);
			Matcher fmatcher = pattern.matcher(name);
			if(fmatcher.matches()) {
				return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
        };
        System.out.println(lastName.format("Jain"));
        
      //Lambda expression for Chceking Email Name
        check emailIdCheck = (enteredValue)->{ 
        	String emailCondition = "[abc]{3}([-+_])?([.][a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
    		Pattern pattern = Pattern.compile(emailCondition);
			Matcher email = pattern.matcher(enteredValue);
			if(email.matches()) {
			return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
        };
        System.out.println(emailIdCheck.format("abc.100@gmail.com"));
        //Lambda expression for Chceking Mobile Number
        check mobileNumber = (enteredValue)->{ 
        	String emailCondition = "(91\s)[0-9]{10}";
    		Pattern pattern = Pattern.compile(emailCondition);
			Matcher email = pattern.matcher(enteredValue);
			if(email.matches()) {
			return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
        };
        System.out.println(mobileNumber.format("91 9967945885"));
        //Lambda expression for Chceking Password
        check password = (enteredValue)->{ 
        	String emailCondition = "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";
    		Pattern pattern = Pattern.compile(emailCondition);
			Matcher email = pattern.matcher(enteredValue);
			if(email.matches()) {
			return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
        };
        System.out.println(password.format("Abcd@1234"));      
	}
}