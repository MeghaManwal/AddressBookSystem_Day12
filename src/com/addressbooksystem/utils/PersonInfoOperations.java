package com.addressbooksystem.utils;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

 class PersonInfoOperations {
	 
	   static Scanner s=new Scanner(System.in);
	
	   public static void addContact(List<Person> persons) {
	
				Person P = new Person();
			    System.out.println("Enter Firstname"); 
			    P.setFirstname(s.nextLine());
			    System.out.println("Enter Lastname"); 
			    P.setLastname(s.nextLine());
			    System.out.println("Enter Address");
			    P.setAddress(s.nextLine());
			    System.out.println("Enter PhoneNumber");
			    P.setphoneNumber(s.nextLine());
			    System.out.println("Enter EmailId");
			    P.setemail(s.nextLine());
			  
			    persons.add(P);
			    System.out.println(persons);
		   
		}

	   	public static void EditContact(List<Person> persons) {
				System.out.println("Enter first name that you want to Edit:");
				String firstName = s.nextLine();
				Person selectedPerson = null;
				for (int i = 0; i < persons.size(); i++) {
				  if (firstName.equals(persons.get(i).getFirstname())) {
					  selectedPerson = persons.get(i);
					  break;
				  }  
				 }  
			      if (selectedPerson != null) {
			    	System.out.println("Enter new Firstname"); 
			    	selectedPerson.setFirstname(s.nextLine());
			        System.out.println("Enter new Lastname"); 
			        selectedPerson.setLastname(s.nextLine());
			        System.out.println("Enter new Address");
			        selectedPerson.setAddress(s.nextLine());
			        System.out.println("Enter new PhoneNumber");
			        selectedPerson.setphoneNumber(s.nextLine());
			        System.out.println("Enter new EmailId");
			        selectedPerson.setemail(s.nextLine());
			        System.out.println(persons);   
			     }	
			     else {
			         System.out.println("Invalid Name!Not Exist");
			      }
	  
	     }

	   	 public static void DeleteContact(List<Person> persons) {
					System.out.println("Enter first name that you want to Delete:");
					String firstName = s.nextLine();
					
					Person selectedPerson = null;
					 for (int i = 0; i < persons.size(); i++) {
						  if (firstName.equals(persons.get(i).getFirstname())) {
							 selectedPerson = persons.get(i);
						  	 break;
						 }  
					  }  
					  if (selectedPerson != null) {	
					      persons.remove(selectedPerson);
					  }	
					  else {
					      System.out.println("Invalid Name!Not Exist");
					  }
	  
	   	  }
}
	


 


	
	 