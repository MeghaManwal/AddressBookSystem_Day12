package com.addressbooksystem.utils;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
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
			    System.out.println("Enter City");
			    P.setCity(s.nextLine());
			    System.out.println("Enter State");
			    P.setState(s.nextLine());
			    System.out.println("Enter Zip");
			    P.setZip(s.nextLine());
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
			        System.out.println("Enter new City");
			        selectedPerson.setCity(s.nextLine());
			        System.out.println("Enter new State");
			        selectedPerson.setState(s.nextLine());
			        System.out.println("Enter new Zip");
			        selectedPerson.setZip(s.nextLine());
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
					    System.out.println("Successfully Deleted!\n");
					    System.out.println(persons); 
					 }	
					 else {
					    System.out.println("Invalid Name!Not Exist");
					 }
	   	  }
	   	 
	   	 public static void sortByname(List<Person> persons) {	 
	   	 
	   		 		Comparator<Person> compareByName = Comparator
                                           .comparing(Person::getFirstname).thenComparing(Person::getLastname);
	   	
	   		 		List<Person> sortedPersonsList = persons.stream()
	   		 										.sorted(compareByName)
	   		 										.collect(Collectors.toList());

	   		 		System.out.println(sortedPersonsList);
	   	 }
	   	 
	   	public static void sortBycity(List<Person> persons) {	 
		   	 
		 		Comparator<Person> compareBycity = Comparator
                                                  .comparing(Person::getCity);
	
		 		List<Person> sortedPersonsList = persons.stream()
		 										.sorted(compareBycity)
		 										.collect(Collectors.toList());

		 		System.out.println(sortedPersonsList);
	   	}
	   	
	   	public static void sortBystate(List<Person> persons) {	 
		   	 
		 		Comparator<Person> compareBystate = Comparator
                                                   .comparing(Person::getState);
	
		 		List<Person> sortedPersonsList = persons.stream()
		 										.sorted(compareBystate)
		 										.collect(Collectors.toList());

		 		System.out.println(sortedPersonsList);
	   	}
	   	
	   	public static void sortByzip(List<Person> persons) {	 
		   	 
		 		Comparator<Person> compareByzip = Comparator
                                                 .comparing(Person::getZip);
	
		 		List<Person> sortedPersonsList = persons.stream()
		 										.sorted(compareByzip)
		 										.collect(Collectors.toList());

		 		System.out.println(sortedPersonsList);
	   	} 		
}
	


 


	
	 