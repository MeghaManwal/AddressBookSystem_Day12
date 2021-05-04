package com.addressbooksystem.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AddressBookOperations {
	
	static Scanner s=new Scanner(System.in);
	
	public static void addAddressBook(Hashtable<String, List<Person>> addressBooks) {
			System.out.println("Add new AddressBook");
	        String bookName = s.nextLine();
	 	    addressBooks.put(bookName, new ArrayList<Person>());
	 		System.out.println(addressBooks);
	}
	
	public static void editAddressBook(Hashtable<String, List<Person>> addressBooks) {
		    System.out.println("Enter the name of the AddressBook you want to Edit");
   	        String bookName1 = s.nextLine();
   	        
   	        if(addressBooks.containsKey(bookName1)) 
   	        {
   	        	
		    List<Person> persons = addressBooks.get(bookName1);
		    
		    int choice;
		    do{
			   System.out.println(" Enter 1 to Add Contact\n Enter 2 to Edit Contact\n Enter 3 to Delete Contact\n Enter 4 to Exit\n");
			   choice=s.nextInt();
			   switch (choice)
		       {
				case 1:
					   System.out.println("Enter the Number of Contacts you would like to add");
					   int n=s.nextInt();
					   for(int i=0;i<n;i++) {
					   PersonInfoOperations.addContact(persons);
					   }
					   Set<String> nameSet = new HashSet<>();
					   List<Person> distinctEntries = persons.stream()
					               .filter(e -> nameSet.add(e.getFirstname()))
					               .collect(Collectors.toList());
					   System.out.println(distinctEntries);
					   break;
				case 2:	
					   PersonInfoOperations.EditContact(persons);
					   break;
				case 3:
					   PersonInfoOperations.DeleteContact(persons);
					   break;
				case 4:
					   System.exit(0);
					   break;
				default:
					   System.out.println("Invalid Input!Please provide valid Input\n");
					   break;
			   } 
			   System.out.println("Do you want to continue (1.Continue or 0.Exit)");
			   choice=s.nextInt();
		       }while(choice != 0);
   	           } 
   	           else {
   	        	      System.out.println("Invalid AddressBook Name!Not exist");
		              }
	 }
	
	public static void searchInAddressBook(Hashtable<String, List<Person>> addressBooks) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of the AddressBook you want to search city for");
	        String bookName1 = s.nextLine();
	        
	        if(addressBooks.containsKey(bookName1)) 
	        {   
	        	Person person = new Person();
	        	List<Person> persons = addressBooks.get(bookName1);
	        	System.out.println("Enter 1 To Search for person by City \n Enter 2 To Search for person by State \n");
	        	int Choice=s.nextInt();
	        	if (Choice==1) {
	        		System.out.println("Enter the name of the city you want to search person for");
	        		String city=s.nextLine();
	        		List<Person> personsList = persons.stream().filter(i -> city.equals(person.getCity())).collect(Collectors.toList());	
	        		System.out.println(personsList);
	        	}
	        	else if(Choice==2) {
	        		System.out.println("Enter the name of the State you want to search person for");
	        		String state=s.nextLine();
	        		List<Person> personsList = persons.stream().filter(i -> state.equals(person.getState())).collect(Collectors.toList());	
	        		System.out.println(personsList);
	        	}
	        	else
	        		System.out.println("Invalid Input!");
	        }
		
	}

}
