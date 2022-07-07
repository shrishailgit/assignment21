package com.parametrizedtest;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidEntry {

		public boolean firstName(String Firstname) {
		
		String patternname = "^[A-Z][a-zA-Z]{3}[a-z]{2,}$";
		Pattern regex = Pattern.compile(patternname);
	    Matcher firstNameMatcher = regex.matcher(Firstname);
	    if (firstNameMatcher.matches()) {
	            System.out.println(Firstname + " is valid First name.");
	            
	           return true;
	    } else {
	            System.out.println(Firstname + " is invalid First name");
	    }
		return false;
		
		}

		
		public boolean lastName(String lastnameStr ) {
			
			
			 String patternname1 = "^[a-z][a-zA-Z]{2,}[A-Z]{3}$";
		        Pattern regex1 = Pattern.compile(patternname1);
		     
		       
		        Matcher lastNameMatches = regex1.matcher(lastnameStr);
		       
		        if (lastNameMatches.matches()) {
		            System.out.println(lastnameStr + " is valid Last Name");
		        	return false;
		        } else {
		            System.out.println(lastnameStr + " is invalid Last Name ");
		        	return false;
		        }
		}
		        
		     public boolean validEmail(String validmail) {
		        	
		        	 String emailId =  "^([a-z]{3}[-.])([a-z]+)*@([a-z]{2}[-.])([a-z]{2}[-.])([a-z]+)*$";
		     		 Pattern regex11 = Pattern.compile(emailId);
		             Matcher emailMatches = regex11.matcher(validmail);
		            
		             if (emailMatches.matches()) {
		                 System.out.println(validmail + " is valid emailid");
		                 return true;
		             } else {
		                 System.out.println(validmail + " is invalid emailid ");
		                 return false;
		             }
			
					
		     }
		             public boolean contactNumber(String ValidPhonNumber1) {
		            	 
		            	    String Phnonumbervalidation =  "^([0-9]{2}[- ])[0-9]{10}$";
		            		
		                    Pattern regex4 = Pattern.compile(Phnonumbervalidation);
		              
		                    Matcher phnoeMatches = regex4.matcher(ValidPhonNumber1);
		                   
		                    if (phnoeMatches.matches()) {
		                        System.out.println(ValidPhonNumber1 + " is valid phone number");
		                    	return true;
		                    } else {
		                        System.out.println(ValidPhonNumber1 + " is invalid phone number ");
		                    	return false;
		                    }    	 
		            	 
		             }
		             
		           
		public static void main(String[] args) {
			UserValidEntry validEntry =new UserValidEntry();
			
			System.out.println("First name starts with Cap and minimum 3 characters : ");
			Scanner scanner = new Scanner(System.in);
			  String Firstname1 = scanner.nextLine();
			validEntry.firstName(Firstname1);
			
			 System.out.print("Last name starts with Cap and  minimum 3 characters: ");
		     String lastnameStr = scanner.nextLine();
		     validEntry.lastName(lastnameStr);
		     
		     System.out.print("Enter the mailid: Ex abc.xzy@bl.co.in ");
		     String valimail = scanner.nextLine();
		     validEntry.validEmail(valimail);
		     
		     
		     System.out.print("Enter phone number: EX 91 1234567895");
		   
		     String ValidPhonNumber1 = scanner.nextLine();
		     validEntry.contactNumber(ValidPhonNumber1);
		     
		}


		public Object emailID(String emailID) {
			// TODO Auto-generated method stub
			return null;
		}
	}

